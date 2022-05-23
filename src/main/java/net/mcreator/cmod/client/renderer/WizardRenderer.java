
package net.mcreator.cmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.WitchModel;

import net.mcreator.cmod.entity.WizardEntity;

public class WizardRenderer extends MobRenderer<WizardEntity, WitchModel<WizardEntity>> {
	public WizardRenderer(EntityRendererProvider.Context context) {
		super(context, new WitchModel(context.bakeLayer(ModelLayers.WITCH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WizardEntity entity) {
		return new ResourceLocation("cmod:textures/wizard.png");
	}
}
