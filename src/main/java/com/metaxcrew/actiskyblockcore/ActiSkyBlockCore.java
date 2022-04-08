package com.metaxcrew.actiskyblockcore;

import com.metaxcrew.actiskyblockcore.addons.MobDrops;
import com.metaxcrew.actiskyblockcore.scoreboard.ScoreBoard;
import com.metaxcrew.actiskyblockcore.staffcommands.GameModeCreative;
import com.metaxcrew.actiskyblockcore.staffcommands.GameModeSpectator;
import com.metaxcrew.actiskyblockcore.staffcommands.GameModeSurvival;
import com.metaxcrew.actiskyblockcore.ultimatecommands.HatCommand;
import com.metaxcrew.actiskyblockcore.ultimatecommands.NightVisionCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class ActiSkyBlockCore extends JavaPlugin {
    private static ActiSkyBlockCore instance;
    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new ScoreBoard(), this);
        getServer().getPluginManager().registerEvents(new MobDrops(), this);

        getCommand("gmc").setExecutor(new GameModeCreative());
        getCommand("gms").setExecutor(new GameModeSurvival());
        getCommand("gmsp").setExecutor(new GameModeSpectator());

        getCommand("hat").setExecutor(new HatCommand());
        getCommand("nv").setExecutor(new NightVisionCommand());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static ActiSkyBlockCore getInstance() {
        return instance;
    }
}
