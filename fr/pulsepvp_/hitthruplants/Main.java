package pulsepvp_.hitthruplants;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import pulsepvp_.hitthruplants.commands.MainCommand;
import pulsepvp_.hitthruplants.managers.EventsManager;

public class Main extends JavaPlugin {
    
    private static ConsoleCommandSender console = Bukkit.getConsoleSender();
    private static Main instance;
    public static HashMap<Player, Boolean> FctIsActive = new HashMap<Player, Boolean>();
    @Override
    public void onEnable() {
    	 instance = this;
        console.sendMessage(ChatColor.GREEN + "HitThruPlants is active");
        new EventsManager().registers();
        getCommand("htp").setExecutor(new MainCommand());
    }
    
    
    @Override
    public void onDisable() {
    }
    
    public static ConsoleCommandSender getConsole() {
        return console;
    }
    public static Main getInstance() {
        return instance;
    }

}
