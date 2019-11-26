package pulsepvp_.hitthruplants.managers;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

import pulsepvp_.hitthruplants.Main;
import pulsepvp_.hitthruplants.listeners.PlayerInteract;

public class EventsManager implements Listener{
	public void registers() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerInteract(), Main.getInstance());
		}
}

