package me.morgancentral99.essentials.Player;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import me.morgancentral99.essentials.utils.ConfigManager;
import net.minecraft.server.v1_12_R1.PlayerSelector;

public class EPlayerManager {
	
	private static HashMap<String, EPlayer> players = new HashMap<>();
	
	
	public static EPlayer getPlayer(Player p) {
		if(players.containsKey(p.getPlayer().getName())) {
			return players.get(p.getName());
		}
		return null;
	}
	
	public static EPlayer getPlayer(String player) {
		if(players.containsKey(player)) {
			return players.get(player);
		}
		return null;
	}
	
	public int getBalance(String player) {
		YamlConfiguration pconfig = ConfigManager.getPlayerConfig(player);
		int Balance = pconfig.getInt("Balance:");
		return Balance;
	}
	
	public int getBalance(EPlayer p) {
		YamlConfiguration pconfig = ConfigManager.getPlayerConfig(p.getName());
		int Balance = pconfig.getInt("Balance:");
		return Balance;
	}
	
	public boolean changeBalance(EPlayer p, boolean Up, int Amount) {
		YamlConfiguration pconfig = ConfigManager.getPlayerConfig(p.getName());
		int oldBalance = pconfig.getInt("Balance:");
		if(Up) {
			int newBalance = oldBalance + Amount;
			pconfig.set("Balance:", newBalance);
		} else if(!Up) {
			int newBalance = oldBalance - Amount;
			if(!(newBalance <= 0)) {
				pconfig.set("Balance:", newBalance);
			}
			return false;
		}
		
		return true;
	}
	
	public boolean changeBalance(String playerName, boolean Up, int Amount) {
		YamlConfiguration pconfig = ConfigManager.getPlayerConfig(playerName);
		int oldBalance = pconfig.getInt("Balance:");
		if(Up) {
			int newBalance = oldBalance + Amount;
			pconfig.set("Balance:", newBalance);
		} else if(!Up) {
			int newBalance = oldBalance - Amount;
			if(!(newBalance <= 0)) {
				pconfig.set("Balance:", newBalance);
			}
			return false;
		}
		
		return true;
	}

}
