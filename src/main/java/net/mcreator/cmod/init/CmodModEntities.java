
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.cmod.entity.WizardEntityProjectile;
import net.mcreator.cmod.entity.WizardEntity;
import net.mcreator.cmod.CmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, CmodMod.MODID);
	public static final RegistryObject<EntityType<WizardEntity>> WIZARD = register("wizard",
			EntityType.Builder.<WizardEntity>of(WizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32)
					.setUpdateInterval(3).setCustomClientFactory(WizardEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<WizardEntityProjectile>> WIZARD_PROJECTILE = register("projectile_wizard",
			EntityType.Builder.<WizardEntityProjectile>of(WizardEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(WizardEntityProjectile::new).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WizardEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WIZARD.get(), WizardEntity.createAttributes().build());
	}
}
