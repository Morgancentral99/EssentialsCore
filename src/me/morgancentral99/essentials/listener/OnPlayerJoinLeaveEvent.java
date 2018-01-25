package me.morgancentral99.essentials.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.morgancentral99.essentials.utils.ConfigManager;

public class OnPlayerJoinLeaveEvent implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		ConfigManager.setDefault(event.getPlayer(), "Flying", event.getPlayer().getAllowFlight());
		Player p = event.getPlayer();
		
	}

	
	@EventHandler
	public void onPlayerQuitEvent(PlayerQuitEvent e) {
		
	}
}
