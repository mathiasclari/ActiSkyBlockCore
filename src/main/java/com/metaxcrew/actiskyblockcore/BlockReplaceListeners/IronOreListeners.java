package com.metaxcrew.actiskyblockcore.BlockReplaceListeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class IronOreListeners implements Listener {

    @EventHandler
    public void onResourceWorlds(BlockBreakEvent e) {

        Block b = e.getBlock();
        Player p = e.getPlayer();
if(p.getItemInHand().getType() == Material.IRON_PICKAXE) {
        if(b.getType() == Material.IRON_ORE){
            p.getInventory().addItem(new ItemStack(Material.RAW_IRON, 1));
            p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
            Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("ActiSkyBlockCore"), new Runnable() {
                @Override
                public void run() {
                    b.getWorld().getBlockAt(b.getLocation()).setType(Material.IRON_ORE);



                }
            }, 3600L);
        }
    }else{
    e.setCancelled(true);
    }
    }
}
