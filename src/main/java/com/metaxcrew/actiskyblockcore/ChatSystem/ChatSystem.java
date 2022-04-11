package com.metaxcrew.actiskyblockcore.ChatSystem;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import com.metaxcrew.actiskyblockcore.ActiSkyBlockCore;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatSystem implements Listener {


    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerPlaceholderChat(AsyncPlayerChatEvent event){
        String format = ChatColorUtils.toHex(ChatColorUtils.color(PlaceholderAPI.setPlaceholders(event.getPlayer(), ActiSkyBlockCore.getInstance().getConf().getString("format", "&7{display_name} &7> {message}").replace("{name}", event.getPlayer().getName()).replace("{display_name}" ,event.getPlayer().getDisplayName()))));
        event.setFormat(format.replace("{message}", event.getMessage().replace("%", "‰")));
    }
}
