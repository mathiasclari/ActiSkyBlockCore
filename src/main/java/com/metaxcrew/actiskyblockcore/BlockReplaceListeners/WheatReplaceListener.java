package com.metaxcrew.actiskyblockcore.BlockReplaceListeners;

import org.bukkit.Bukkit;
import org.bukkit.CropState;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Crops;

public class WheatReplaceListener implements Listener {
@EventHandler
public void onResourceWorlds(BlockBreakEvent e) {
    Block b = e.getBlock();
    Player p = e.getPlayer();

        if (b.getType() == Material.WHEAT) { // block is wheat, ripeness not checked yet
            BlockData blockData = e.getBlock().getBlockData(); // save block data of original wheat
            p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
            Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("ActiSkyBlockCore"), () -> {
                Block newBlock = b.getWorld().getBlockAt(b.getLocation());
                if (newBlock.getType() != Material.WHEAT && newBlock.getType() != Material.AIR) return; // block isn't wheat or air, player has interfered so cancel the event.
                newBlock.setType(Material.WHEAT);
                b.setBlockData(blockData); // restore original block data
            }, 40L); // 40 ticks / 20 tps = 2 seconds
        }
}
}


