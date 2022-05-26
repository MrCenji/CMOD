
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.cmod.enchantment.SpeedstealEnchantment;
import net.mcreator.cmod.enchantment.LevitatorEnchantment;
import net.mcreator.cmod.enchantment.JumpstealEnchantment;
import net.mcreator.cmod.CmodMod;

public class CmodModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, CmodMod.MODID);
	public static final RegistryObject<Enchantment> SPEEDSTEAL = REGISTRY.register("speedsteal", () -> new SpeedstealEnchantment());
	public static final RegistryObject<Enchantment> LEVITATOR = REGISTRY.register("levitator", () -> new LevitatorEnchantment());
	public static final RegistryObject<Enchantment> JUMPSTEAL = REGISTRY.register("jumpsteal", () -> new JumpstealEnchantment());
}
