package com.metaxcrew.actiskyblockcore;

import com.metaxcrew.actiskyblockcore.BlockReplaceListeners.BlockBreakListener;
import com.metaxcrew.actiskyblockcore.ChatSystem.ChatSystem;
import com.metaxcrew.actiskyblockcore.ChatSystem.JoinMessage;
import com.metaxcrew.actiskyblockcore.SkyBlockSystem.EmptyChunkGenerator;
import com.metaxcrew.actiskyblockcore.addons.MobDrops;
import com.metaxcrew.actiskyblockcore.scoreboard.ScoreBoard;
import com.metaxcrew.actiskyblockcore.staffcommands.*;
import com.metaxcrew.actiskyblockcore.ultimatecommands.HatCommand;
import com.metaxcrew.actiskyblockcore.ultimatecommands.NightVisionCommand;

import org.bukkit.WorldCreator;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class ActiSkyBlockCore extends JavaPlugin {

    private static ActiSkyBlockCore instance;
    private final YamlConfiguration conf = new YamlConfiguration();

    @Override
    public void onEnable() {
        instance = this;

        //config
        File co = new File(getDataFolder(), "config.yml");
        if(!co.exists()) saveResource("config.yml", false);

        try{
            this.conf.load(co);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }

        if(getServer().getWorld("acti_player_skyblock") == null) {
            WorldCreator worldCreator = new WorldCreator("acti_player_skyblock");
            worldCreator.generator(new EmptyChunkGenerator());
            worldCreator.createWorld();
        }
        getServer().getPluginManager().registerEvents(new ScoreBoard(), this);
        getServer().getPluginManager().registerEvents(new MobDrops(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        getServer().getPluginManager().registerEvents(new ChatSystem(), this);
        getServer().getPluginManager().registerEvents(new JoinMessage(), this);

        //staff commands
        getCommand("gmc").setExecutor(new GameModeCreative());
        getCommand("gms").setExecutor(new GameModeSurvival());
        getCommand("gmsp").setExecutor(new GameModeSpectator());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("day").setExecutor(new DayCommand());
        getCommand("night").setExecutor(new NightCommand());

        //ultimate commands
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
    public YamlConfiguration getConf() { return this.conf; }
}
