
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.cmod.world.features.ores.GraniteAluminumFeature;
import net.mcreator.cmod.world.features.ores.AluminumFeature;
import net.mcreator.cmod.CmodMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CmodMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> ALUMINUM_ORE = register("aluminum_ore", AluminumFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AluminumFeature.GENERATE_BIOMES, AluminumFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GRANITE_ALUMINUM_ORE = register("granite_aluminum_ore", GraniteAluminumFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GraniteAluminumFeature.GENERATE_BIOMES,
					GraniteAluminumFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
