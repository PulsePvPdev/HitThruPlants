package pulsepvp_.hitthruplants.listeners;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import pulsepvp_.hitthruplants.utils.MainUtils;

public class PlayerInteract implements Listener {
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteract(BlockBreakEvent event){
	if((event.getBlock().getType() == Material.SUNFLOWER ||
	   event.getBlock().getType() == Material.LEGACY_RED_ROSE ||	
	   event.getBlock().getType() == Material.GRASS ||
	   event.getBlock().getType() == Material.LEGACY_LONG_GRASS) && MainUtils.getNearestEntityInSight(event.getPlayer(),3) != null) {
			event.setCancelled(true);
			LivingEntity mobs = (LivingEntity) MainUtils.getNearestEntityInSight(event.getPlayer(),3);
			mobs.damage(1);
		}
		
	}
}
