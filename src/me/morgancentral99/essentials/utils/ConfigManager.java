package me.morgancentral99.essentials.utils;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class ConfigManager {
	 
	private static HashMap<String, PlayerConfig> playerConfigs = new HashMap<>();
	
	public static YamlConfiguration getPlayerConfig(String pl) {
		PlayerConfig pc = playerConfigs.get(pl);
		return pc.getConfig();
	}
	
	public static YamlConfiguration getPlayerConfig(Player p) {
		PlayerConfig pc = playerConfigs.get(p.getName());
		return pc.getConfig();
	}
	
	public static void setDefault(Player p, String path, Object o) {
		PlayerConfig pc = playerConfigs.get(p.getName());
		pc.PConfig.set(path, o);
	}
	
	public static void setDefault(String player, String path, Object o) {
		PlayerConfig pc = playerConfigs.get(player);
		pc.PConfig.set(path, o);
	}
	
	public YamlConfiguration registerPlayerConfig(Player p, boolean isNew) {
		PlayerConfig pc = new PlayerConfig(p);
		playerConfigs.put(p.getName(), pc);
		if(isNew) {
			pc.createDefaults();
		}
		return pc.getConfig();
	}

}
