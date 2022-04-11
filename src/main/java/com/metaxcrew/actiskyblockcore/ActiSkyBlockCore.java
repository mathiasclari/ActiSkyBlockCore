package com.metaxcrew.actiskyblockcore;

import com.metaxcrew.actiskyblockcore.BlockReplaceListeners.BlockBreakListener;
import com.metaxcrew.actiskyblockcore.BlockReplaceListeners.IronOreListeners;
import com.metaxcrew.actiskyblockcore.BlockReplaceListeners.WheatReplaceListener;
import com.metaxcrew.actiskyblockcore.addons.MobDrops;
import com.metaxcrew.actiskyblockcore.scoreboard.ScoreBoard;
import com.metaxcrew.actiskyblockcore.staffcommands.GameModeCreative;
import com.metaxcrew.actiskyblockcore.staffcommands.GameModeSpectator;
import com.metaxcrew.actiskyblockcore.staffcommands.GameModeSurvival;
import com.metaxcrew.actiskyblockcore.ultimatecommands.HatCommand;
import com.metaxcrew.actiskyblockcore.ultimatecommands.NightVisionCommand;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public final class ActiSkyBlockCore extends JavaPlugin {

    private static ActiSkyBlockCore instance;

    @Override
    public void onEnable() {
        instance = this;


        getServer().getPluginManager().registerEvents(new ScoreBoard(), this);
        getServer().getPluginManager().registerEvents(new MobDrops(), this);
        //getServer().getPluginManager().registerEvents(new WheatReplaceListener(), this);
        //getServer().getPluginManager().registerEvents(new IronOreListeners(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);

        getCommand("gmc").setExecutor(new GameModeCreative());
        getCommand("gms").setExecutor(new GameModeSurvival());
        getCommand("gmsp").setExecutor(new GameModeSpectator());

        getCommand("hat").setExecutor(new HatCommand());
        getCommand("nv").setExecutor(new NightVisionCommand());


    }

    @Override
    public void onDisable() {
        HandlerList.unregisterAll(this); // unregister ALL events, makes it friendly with plugin managers like PlugMan
    }
    public static ActiSkyBlockCore getInstance() {
        return instance;
    }
}
