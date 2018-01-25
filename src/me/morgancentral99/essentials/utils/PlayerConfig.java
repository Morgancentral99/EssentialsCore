package me.morgancentral99.essentials.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import me.morgancentral99.essentials.EssentialsCore;

public class PlayerConfig {
	
	File file;
	String UUID;
	YamlConfiguration PConfig;
	Player p;
	public PlayerConfig(Player p) {
		this.p = p;
		UUID = p.getUniqueId().toString();
		file = new File(EssentialsCore.getInstance().getDataFolder() + "/players/" + UUID + ".yml");
		if(!file.exists()) {
			file.mkdirs();
		}
		PConfig = YamlConfiguration.loadConfiguration(file);
		
		
		
	}
	
	public void createDefaults() {
		PConfig.addDefault("Money:", 0);
		PConfig.addDefault("Flying:", false);
		
		
		PConfig.options().copyDefaults();
		try {
			PConfig.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public YamlConfiguration getConfig() {
		return PConfig;
	}

}
