
package net.mcreator.cmod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.InteractionResult;

import net.mcreator.cmod.procedures.WizardFireRightclickedOnBlockProcedure;

public class WizardFireItem extends Item {
	public WizardFireItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		WizardFireRightclickedOnBlockProcedure.execute(context.getLevel(), context.getPlayer(), context.getItemInHand());
		return retval;
	}
}
