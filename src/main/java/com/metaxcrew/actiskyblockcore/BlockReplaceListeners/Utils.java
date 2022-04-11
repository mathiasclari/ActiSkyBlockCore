package com.metaxcrew.actiskyblockcore.BlockReplaceListeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class Utils {
	public static boolean isUsingAxe(Player player) {
		return Arrays.asList(Material.WOODEN_AXE, Material.STONE_AXE, Material.IRON_AXE, Material.GOLDEN_AXE, Material.DIAMOND_AXE, Material.NETHERITE_AXE).contains(player.getInventory().getItemInMainHand().getType());
	}
}
