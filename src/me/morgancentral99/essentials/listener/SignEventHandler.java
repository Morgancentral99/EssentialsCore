package me.morgancentral99.essentials.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

import me.morgancentral99.essentials.EssentialsCore;
import me.morgancentral99.essentials.Player.EPlayerManager;
import net.md_5.bungee.api.ChatColor;

public class SignEventHandler implements Listener {
	
	private EssentialsCore instance = EssentialsCore.getInstance();
	private EPlayerManager eplayer = new EPlayerManager();
	private boolean isEditingAllowed = false;
	@EventHandler
	public void onSignCreateEvent(SignChangeEvent e) {
		Player p = e.getPlayer();
		if(p.hasPermission("EssentialsCore.Signs.color")) {
			String[] signMesssage = e.getLines();
			e.setLine(0, ChatColor.translateAlternateColorCodes('&', signMesssage[0]));
			e.setLine(1, ChatColor.translateAlternateColorCodes('&', signMesssage[1]));
			e.setLine(2, ChatColor.translateAlternateColorCodes('&', signMesssage[2]));
			e.setLine(3, ChatColor.translateAlternateColorCodes('&', signMesssage[3]));
		}
	}

}
