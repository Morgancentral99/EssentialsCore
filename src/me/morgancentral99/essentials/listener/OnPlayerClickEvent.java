package me.morgancentral99.essentials.listener;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class OnPlayerClickEvent implements Listener {
	
	@EventHandler
	public void onClick(PlayerInteractEvent e) {
		Block block = e.getClickedBlock();
		
	}

}
