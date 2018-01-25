package me.morgancentral99.essentials.command.Player;

import java.util.ArrayList;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.morgancentral99.essentials.Player.EPlayer;
import me.morgancentral99.essentials.Player.EPlayerManager;
import me.morgancentral99.essentials.command.ECommand;
import net.md_5.bungee.api.ChatColor;

public class FlyCommand extends ECommand {
	
	public FlyCommand() {
		setMainCommand("Fly");
		setDescription("Alows Flight");
		setPermissions("EssentialsCore.Flight");
		setName("Flight");
	}

	@Override
	public void runCommand(CommandSender sender, Player p, EPlayer ep,  String[] args) {
		if(args.length == 0) {
			if(p.getAllowFlight()) {
				p.sendMessage(ChatColor.GOLD + "Flight Disabled.");
				p.setAllowFlight(false);
			} else if(!p.getAllowFlight()) {
				p.sendMessage(ChatColor.GOLD + "Flight Enabled.");
				p.setAllowFlight(true);
			}
		}
		
	}
	
	
	
	

}
