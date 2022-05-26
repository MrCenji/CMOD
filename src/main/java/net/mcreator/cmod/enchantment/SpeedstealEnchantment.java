
package net.mcreator.cmod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.cmod.init.CmodModItems;
import net.mcreator.cmod.init.CmodModEnchantments;

public class SpeedstealEnchantment extends Enchantment {
	public SpeedstealEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		if (ench == CmodModEnchantments.LEVITATOR.get())
			return true;
		if (ench == CmodModEnchantments.JUMPSTEAL.get())
			return true;
		return false;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == CmodModItems.ENCHANTABLE_WAND.get())
			return true;
		return false;
	}
}
