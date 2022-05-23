
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.cmod.block.SpruceTableBlock;
import net.mcreator.cmod.block.OakTableBlock;
import net.mcreator.cmod.block.JungleTableBlock;
import net.mcreator.cmod.block.GraniteAluminumBlock;
import net.mcreator.cmod.block.DarkOakTableBlock;
import net.mcreator.cmod.block.BlockOfAluminumBlock;
import net.mcreator.cmod.block.BirchTableBlock;
import net.mcreator.cmod.block.AluminumBlock;
import net.mcreator.cmod.block.AcaciaTableBlock;
import net.mcreator.cmod.CmodMod;

public class CmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CmodMod.MODID);
	public static final RegistryObject<Block> ALUMINUM_ORE = REGISTRY.register("aluminum_ore", () -> new AluminumBlock());
	public static final RegistryObject<Block> GRANITE_ALUMINUM_ORE = REGISTRY.register("granite_aluminum_ore", () -> new GraniteAluminumBlock());
	public static final RegistryObject<Block> BLOCK_OF_ALUMINUM = REGISTRY.register("block_of_aluminum", () -> new BlockOfAluminumBlock());
	public static final RegistryObject<Block> OAK_TABLE = REGISTRY.register("oak_table", () -> new OakTableBlock());
	public static final RegistryObject<Block> SPRUCE_TABLE = REGISTRY.register("spruce_table", () -> new SpruceTableBlock());
	public static final RegistryObject<Block> BIRCH_TABLE = REGISTRY.register("birch_table", () -> new BirchTableBlock());
	public static final RegistryObject<Block> JUNGLE_TABLE = REGISTRY.register("jungle_table", () -> new JungleTableBlock());
	public static final RegistryObject<Block> ACACIA_TABLE = REGISTRY.register("acacia_table", () -> new AcaciaTableBlock());
	public static final RegistryObject<Block> DARK_OAK_TABLE = REGISTRY.register("dark_oak_table", () -> new DarkOakTableBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			OakTableBlock.registerRenderLayer();
			SpruceTableBlock.registerRenderLayer();
			BirchTableBlock.registerRenderLayer();
			JungleTableBlock.registerRenderLayer();
			AcaciaTableBlock.registerRenderLayer();
			DarkOakTableBlock.registerRenderLayer();
		}
	}
}
