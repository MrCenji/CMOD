
package net.mcreator.cmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.cmod.procedures.EnchantableWandLivingEntityIsHitWithToolProcedure;
import net.mcreator.cmod.init.CmodModItems;

public class EnchantableWandItem extends SwordItem {
	public EnchantableWandItem() {
		super(new Tier() {
			public int getUses() {
				return 1500;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CmodModItems.WIZARD_FIRE.get()));
			}
		}, 3, -3.5f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		EnchantableWandLivingEntityIsHitWithToolProcedure.execute(entity, sourceentity, itemstack);
		return retval;
	}
}
