package me.regos.antihunger.commands;

import me.regos.antihunger.AntiHunger;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HungerToggle implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            if(AntiHunger.getOn() == false){
                AntiHunger.setOn(true);
                p.sendMessage("You have successfully set hunger change event to " + ChatColor.RED + "false");
            }else {
                AntiHunger.setOn(false);
                p.sendMessage("You have successfully set hunger change event to " + ChatColor.GREEN + "true");
            }
        }

        return true;
    }
}
