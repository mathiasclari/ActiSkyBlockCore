package com.metaxcrew.actiskyblockcore;

import com.metaxcrew.actiskyblockcore.addons.MobDrops;
import com.metaxcrew.actiskyblockcore.scoreboard.ScoreBoard;
import org.bukkit.plugin.java.JavaPlugin;

public final class ActiSkyBlockCore extends JavaPlugin {
    private static ActiSkyBlockCore instance;
    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new ScoreBoard(), this);
        getServer().getPluginManager().registerEvents(new MobDrops(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static ActiSkyBlockCore getInstance() {
        return instance;
    }
}
