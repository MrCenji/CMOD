package net.mcreator.cmod.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.cmod.init.CmodModEnchantments;

public class EnchantableWandLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(CmodModEnchantments.SPEEDSTEAL.get(), itemstack) == 1) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 15, 2, (false), (false)));
		} else if (EnchantmentHelper.getItemEnchantmentLevel(CmodModEnchantments.SPEEDSTEAL.get(), itemstack) == 2) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 30, 2, (false), (false)));
		} else if (EnchantmentHelper.getItemEnchantmentLevel(CmodModEnchantments.SPEEDSTEAL.get(), itemstack) == 3) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2, (false), (false)));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(CmodModEnchantments.LEVITATOR.get(), itemstack) == 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 15, 1, (false), (false)));
		} else if (EnchantmentHelper.getItemEnchantmentLevel(CmodModEnchantments.LEVITATOR.get(), itemstack) == 2) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 20, 2, (false), (false)));
		} else if (EnchantmentHelper.getItemEnchantmentLevel(CmodModEnchantments.LEVITATOR.get(), itemstack) == 3) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 25, 3, (false), (false)));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(CmodModEnchantments.JUMPSTEAL.get(), itemstack) == 1) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 15, 1, (false), (false)));
		} else if (EnchantmentHelper.getItemEnchantmentLevel(CmodModEnchantments.JUMPSTEAL.get(), itemstack) == 2) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 30, 2, (false), (false)));
		} else if (EnchantmentHelper.getItemEnchantmentLevel(CmodModEnchantments.JUMPSTEAL.get(), itemstack) == 3) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 45, 3, (false), (false)));
		}
	}
}
