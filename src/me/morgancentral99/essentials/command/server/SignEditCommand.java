package me.morgancentral99.essentials.command.server;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.morgancentral99.essentials.Player.EPlayer;
import me.morgancentral99.essentials.command.ECommand;
import net.md_5.bungee.api.ChatColor;

public class SignEditCommand extends ECommand {
	
	public SignEditCommand() {
		setDescription("Sign");
		setMainCommand("Signedit");
		setName("SignEdit");
		setPermissions("EssentialsCore.Signs.edit");
		setArgs(0);
	}

	@Override
	public void runCommand(CommandSender sender, Player p, EPlayer ep, String[] args) {
		if(ep.isSignEditEnabled()) {
			p.sendMessage(ChatColor.GOLD + "Sign Editor Disabled...");
			ep.setSignEditEnabled(false);
		} else if(!ep.isSignEditEnabled()) {
			p.sendMessage(ChatColor.GOLD + "Sign Editor Enabled... Click a sign to edit it!");
			ep.setSignEditEnabled(true);
		}
		
	}

}
