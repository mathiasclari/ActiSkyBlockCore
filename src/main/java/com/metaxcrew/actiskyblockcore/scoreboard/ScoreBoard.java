package com.metaxcrew.actiskyblockcore.scoreboard;


import com.metaxcrew.actiskyblockcore.ActiSkyBlockCore;

import fr.mrmicky.fastboard.FastBoard;
import me.clip.placeholderapi.PlaceholderAPI;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ScoreBoard implements Listener {


    private final Map<UUID, FastBoard> boards = new HashMap<>();

    public ScoreBoard() {
        Bukkit.getServer().getScheduler().runTaskTimer(ActiSkyBlockCore.getInstance(), () -> {
            for (FastBoard board : this.boards.values()) {
                updateBoard(board);
            }
        }, 0, 20);
    }

    @EventHandler

    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        FastBoard lobbysb = new FastBoard(player);

        lobbysb.updateTitle(ChatColor.of("#2255DF") + "" + ChatColor.BOLD + "SkyBlock");

        this.boards.put(player.getUniqueId(), lobbysb);


    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();

        FastBoard lobbysb = this.boards.remove(player.getUniqueId());

        if (lobbysb != null) {
            lobbysb.delete();
        }

    }


    private void updateBoard(FastBoard lobbysb) {

        lobbysb.updateLines(
                "",
                ChatColor.of("#577BDF")+""+ChatColor.BOLD + "Personal Stats:",
                ChatColor.of("#738291") + "» " + ChatColor.of("#94A8E2") + "Fly: " + ChatColor.of("#C4CDD6") + PlaceholderAPI.setPlaceholders(lobbysb.getPlayer(),"%player_allow_flight%"),
                ChatColor.of("#738291") + "» " + ChatColor.of("#94A8E2") + "Kills: " + ChatColor.of("#C4CDD6") + lobbysb.getPlayer().getStatistic(Statistic.PLAYER_KILLS),
                ChatColor.of("#738291") + "» " + ChatColor.of("#94A8E2") + "Deaths: " + ChatColor.of("#C4CDD6") + lobbysb.getPlayer().getStatistic(Statistic.PLAYER_KILLS),
                ChatColor.of("#738291") + "» " + ChatColor.of("#94A8E2") + "Coins: " + ChatColor.of("#C4CDD6") + PlaceholderAPI.setPlaceholders(lobbysb.getPlayer(),"%vault_eco_balance_fixed%"),
                "",
                ChatColor.of("#577BDF")+""+ChatColor.BOLD + "Island Stats:",
                ChatColor.of("#738291") + "» " + ChatColor.of("#94A8E2") + "Position: " + ChatColor.of("#C4CDD6") + PlaceholderAPI.setPlaceholders(lobbysb.getPlayer(),"%fabledskyblock_island_leaderboard_level_rank%"),
                ChatColor.of("#738291") + "» " + ChatColor.of("#94A8E2") + "Level: " + ChatColor.of("#C4CDD6") + PlaceholderAPI.setPlaceholders(lobbysb.getPlayer(),"%fabledskyblock_island_level_formatted%"),
                ChatColor.of("#738291") + "» " + ChatColor.of("#94A8E2") + "Members: " + ChatColor.of("#C4CDD6") + PlaceholderAPI.setPlaceholders(lobbysb.getPlayer(),"%fabledskyblock_island_members%"),
                ChatColor.of("#738291") + "» " + ChatColor.of("#94A8E2") + "Role: " + ChatColor.of("#C4CDD6") + PlaceholderAPI.setPlaceholders(lobbysb.getPlayer(),"%fabledskyblock_island_role%"),
                ChatColor.of("#738291") + "» " + ChatColor.of("#94A8E2") + "Bank: " + ChatColor.of("#C4CDD6") + PlaceholderAPI.setPlaceholders(lobbysb.getPlayer(),"%fabledskyblock_island_bank_balance_formatted%"),
                "",
                ChatColor.of("#2255DF") + "" + ChatColor.BOLD + "www.acticraft.net");
    }
}
