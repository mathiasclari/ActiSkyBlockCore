package com.metaxcrew.actiskyblockcore.addons;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerHarvestBlockEvent;

public class ResourceWorlds implements Listener {

@EventHandler
public void onResourceWorlds(PlayerHarvestBlockEvent event) {
    Player p = event.getPlayer();
    if (p.getWorld().getName().equalsIgnoreCase("farm_world")) {
        if (event.getHarvestedBlock().getType() == Material.IRON_ORE) {

          }
      }
    }
}