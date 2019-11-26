package pulsepvp_.hitthruplants.commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pulsepvp_.hitthruplants.Main;


public class MainCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label,
            String[] args) {
    	if (label.equalsIgnoreCase("htp")) {
    		if(Main.FctIsActive.get(sender)) {
	    		sender.sendMessage("" + ChatColor.GOLD + ChatColor.BOLD + "HitThruPlants » " + ChatColor.RESET + ChatColor.RED + "Vous venez de désactiver le script Hit Thru Plants");
	    		Main.FctIsActive.replace(((Player)sender), false);
	    	}
	    	else {
	    		sender.sendMessage("" + ChatColor.GOLD + ChatColor.BOLD + "HitThruPlants » " + ChatColor.RESET + ChatColor.GREEN + "Vous venez d'activer le script Hit Thru Plants");
	    		Main.FctIsActive.replace(((Player)sender), true);
	    	}
    		}
    	return true;
    }
}
