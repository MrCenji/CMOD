package net.mcreator.cmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class WizardEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
			entityToSpawn
					.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextDouble(new Random(), -7, 7), y, z + Mth.nextDouble(new Random(), -7, 7))));
			entityToSpawn.setVisualOnly(false);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
