package pulsepvp_.hitthruplants.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class MainUtils implements Listener {
	public static Entity getNearestEntityInSight(Player p, int range){
		List<Entity> entities = p.getNearbyEntities(range,range,range);Iterator<Entity> iterator = entities.iterator(); 
		while(iterator.hasNext()){
			Entity next = iterator.next(); 
				if(!(next instanceof LivingEntity) || next == p){
					iterator.remove();
				}
		}
		List<Block> sight = p.getLineOfSight((Set<Material>) null, range); 
		for(Block block : sight){
			if(block.getType() != Material.AIR){
			break;
			}
			
			for(Entity entity : entities){
				if(entity.getLocation().distance(p.getEyeLocation()) <= range && (entity.getLocation().distance(block.getLocation()) <= 1 || entity.getLocation().add(0,1,0).distance(block.getLocation()) <= 1)) {
				return entity;
				}
			}
		}
		
		
		return null;
	}

	}
