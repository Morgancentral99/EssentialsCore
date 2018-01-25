package me.morgancentral99.essentials.command;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.morgancentral99.essentials.EssentialsCore;
import me.morgancentral99.essentials.Player.EPlayer;
import me.morgancentral99.essentials.Player.EPlayerManager;
import net.md_5.bungee.api.ChatColor;

public class CommandManager implements CommandExecutor {

	private HashMap<String, ECommand> command;
	private static CommandManager commandManagerInstance;
	private HashMap<String, ECommand> commandAliasExecute;
	private ArrayList<String> registerCommands;
	public CommandManager() {
		registerCommands = new ArrayList<>();
		commandAliasExecute = new HashMap<>();
		command = new HashMap<>();
		commandManagerInstance = this;
	}
	
	public boolean registerCommand(ECommand comm) {
		commandAliasExecute.put(comm.getMainCommand(), comm);
		registerCommands.add(comm.getMainCommand());
		if(comm.getAlias().isEmpty()) {
			return true;
		}
		for(String command : comm.getAlias()) {
			commandAliasExecute.put(command, comm);
			registerCommands.add(command);
		}
		return true;
	}
	
	public void BukkitCommandProxy() {
		for(String command : registerCommands) {
			EssentialsCore.getInstance().getCommand(command).setExecutor(this);
		}
	}
	

	public static CommandManager getCommandManager() {
		return commandManagerInstance;
	}

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		if(commandAliasExecute.containsKey(label)) {
			 ECommand ecomm = commandAliasExecute.get(label);
			 if(s.hasPermission(ecomm.getPermission())) {
				 if(ecomm.getArgs() == args.length) {
					 Player p = (Player)s;
					EPlayer ep = EPlayerManager.getPlayer(p);
					 ecomm.runCommand(s, p, ep, args);
				 }
			 }
			 s.sendMessage(ChatColor.RED + "No Permission");
			 return true;
		}
		return false;
	}
}
