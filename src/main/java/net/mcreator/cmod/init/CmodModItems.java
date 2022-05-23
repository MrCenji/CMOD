
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cmod.item.WizardFireItem;
import net.mcreator.cmod.item.LightningWandItem;
import net.mcreator.cmod.item.ExplosiveWandItem;
import net.mcreator.cmod.item.EnchantableWandItem;
import net.mcreator.cmod.item.AluminumShardsItem;
import net.mcreator.cmod.CmodMod;

public class CmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CmodMod.MODID);
	public static final RegistryObject<Item> LIGHTNING_WAND = REGISTRY.register("lightning_wand", () -> new LightningWandItem());
	public static final RegistryObject<Item> WIZARD = REGISTRY.register("wizard_spawn_egg",
			() -> new ForgeSpawnEggItem(CmodModEntities.WIZARD, -13691136, -16774145, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> WIZARD_FIRE = REGISTRY.register("wizard_fire", () -> new WizardFireItem());
	public static final RegistryObject<Item> EXPLOSIVE_WAND = REGISTRY.register("explosive_wand", () -> new ExplosiveWandItem());
	public static final RegistryObject<Item> ALUMINUM_ORE = block(CmodModBlocks.ALUMINUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GRANITE_ALUMINUM_ORE = block(CmodModBlocks.GRANITE_ALUMINUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ALUMINUM_SHARDS = REGISTRY.register("aluminum_shards", () -> new AluminumShardsItem());
	public static final RegistryObject<Item> BLOCK_OF_ALUMINUM = block(CmodModBlocks.BLOCK_OF_ALUMINUM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OAK_TABLE = block(CmodModBlocks.OAK_TABLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SPRUCE_TABLE = block(CmodModBlocks.SPRUCE_TABLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BIRCH_TABLE = block(CmodModBlocks.BIRCH_TABLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> JUNGLE_TABLE = block(CmodModBlocks.JUNGLE_TABLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ACACIA_TABLE = block(CmodModBlocks.ACACIA_TABLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DARK_OAK_TABLE = block(CmodModBlocks.DARK_OAK_TABLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ENCHANTABLE_WAND = REGISTRY.register("enchantable_wand", () -> new EnchantableWandItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
