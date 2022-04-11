package com.metaxcrew.actiskyblockcore.ChatSystem;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinMessage implements Listener {
    @EventHandler
    public void onFirstJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        if (event.getPlayer().hasPlayedBefore()) {
            event.setJoinMessage(ChatColor.of("#2473E9")+p.getName() + ChatColor.of("#7EABEE") +" has joined the server");
        }
        event.setJoinMessage(ChatColor.of("#2473E9")+p.getName() + ChatColor.of("#7EABEE") +" has joined SkyBlock for the first time!");
    }
}
