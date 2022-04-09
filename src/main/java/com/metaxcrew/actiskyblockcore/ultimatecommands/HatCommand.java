package com.metaxcrew.actiskyblockcore.ultimatecommands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Effect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class HatCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player && !sender.hasPermission("acs_ultimate_hat")) {
            sender.sendMessage(ChatColor.of("#2255DF") + "You do not have permission to execute this command!");
            return true;
        } else {
            if (args.length == 0)
                if (sender instanceof Player) {
                    Player p = (Player) sender;
                    if (null != p.getInventory().getHelmet()) {
                        sender.sendMessage(ChatColor.of("#2255DF") + "You already have something on your head!");
                        // return
                    } else {
                        p.getInventory().setHelmet(new ItemStack(p.getInventory().getItemInMainHand()));
                        p.getInventory().removeItem(new ItemStack(p.getInventory().getItemInMainHand()));
                        p.playEffect(p.getLocation(), Effect.CLICK1, 5);
                        p.playEffect(p.getLocation(), Effect.BOW_FIRE, 5);
                        sender.sendMessage(ChatColor.of("#94A8E2") + "Hat has been set!");
                        return true;
                    }
                } else {
                    sender.sendMessage(ChatColor.of("#2255DF") + "You must be a player to execute this command!");
                    return true;
                }
        }
        return true;
    }
}
