package me.morgancentral99.essentials.command;

import java.util.ArrayList;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.morgancentral99.essentials.Player.EPlayer;
import me.morgancentral99.essentials.Player.EPlayerManager;

public abstract class ECommand {
	
	private ArrayList<String> alias = new ArrayList<>();
	private String CommandName;
	private String Desc;
	private String Permission;
	private String MainCommand;
	private int args; 
	
	/**
	 * @return the args
	 */
	public int getArgs() {
		return args;
	}

	/**
	 * @param args the args to set
	 */
	public void setArgs(int args) {
		this.args = args;
	}

	public abstract void runCommand(CommandSender sender, Player p, EPlayer ep, String[] args);
	
	public void addAlias(ArrayList<String> alias) {
		this.alias = alias;
	}
	
	public void setName(String Name) {
		this.CommandName = Name;
	}
	
	public void setDescription(String Desc) {
		this.Desc = Desc;
	}

	public void setPermissions(String Permission) {
		this.Permission = Permission;
	}
	
	public ArrayList<String> getAlias() {
		return alias;
	}
	
	public String getCommandName() {
		return CommandName;
	}
	
	public String getDesc() {
		return Desc;
	}
	
	public String getPermission() {
		return Permission;
	}

	public String getMainCommand() {
		return MainCommand;
	}

	public void setMainCommand(String mainCommand) {
		MainCommand = mainCommand;
	}
}
