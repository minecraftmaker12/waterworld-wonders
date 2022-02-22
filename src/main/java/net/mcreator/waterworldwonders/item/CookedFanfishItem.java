
package net.mcreator.waterworldwonders.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.waterworldwonders.WaterworldWondersModElements;

@WaterworldWondersModElements.ModElement.Tag
public class CookedFanfishItem extends WaterworldWondersModElements.ModElement {
	@ObjectHolder("waterworld_wonders:cooked_fanfish")
	public static final Item block = null;

	public CookedFanfishItem(WaterworldWondersModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(5).saturation(0.3f)

							.meat().build()));
			setRegistryName("cooked_fanfish");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
