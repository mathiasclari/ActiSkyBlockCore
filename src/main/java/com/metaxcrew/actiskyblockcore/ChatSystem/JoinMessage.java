package com.metaxcrew.actiskyblockcore.ChatSystem;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinMessage implements Listener {
    @EventHandler
    public void Join(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        event.setJoinMessage(ChatColor.of("#2473E9")+p.getName() + ChatColor.of("#7EABEE") +" has joined SkyBlock!");

    }
}
