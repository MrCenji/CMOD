
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.cmod.client.renderer.WizardRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CmodModEntities.WIZARD.get(), WizardRenderer::new);
		event.registerEntityRenderer(CmodModEntities.WIZARD_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
