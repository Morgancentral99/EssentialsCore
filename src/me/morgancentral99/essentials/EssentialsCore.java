package me.morgancentral99.essentials;

import org.bukkit.plugin.java.JavaPlugin;

import me.morgancentral99.essentials.command.CommandManager;
import me.morgancentral99.essentials.utils.Methods;
import me.morgancentral99.essentials.utils.Methods.LogLevel;

public class EssentialsCore extends JavaPlugin {
	
	static EssentialsCore instance;
	CommandManager cm = new CommandManager();
	@Override
	public void onEnable() {
		instance = this;
		cm.BukkitCommandProxy();
		Methods.log(LogLevel.INFO, "Loaded Essentials Core by Morgan P");
		super.onEnable();
	}
	
	public void onDisable() { 
		
		super.onDisable();
	}
	

	
	private void registerListeners() {

	}
	
	public static EssentialsCore getInstance() {
		return instance;
	}

}
