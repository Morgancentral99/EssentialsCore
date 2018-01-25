package me.morgancentral99.essentials.Player;

import org.bukkit.entity.Player;

public class EPlayer {
	
	public String UUID;
	public String name;
	public Player player;
	public boolean signEditEnabled;
	/**
	 * @return the signEditEnabled
	 */
	public boolean isSignEditEnabled() {
		return signEditEnabled;
	}
	/**
	 * @param signEditEnabled the signEditEnabled to set
	 */
	public void setSignEditEnabled(boolean signEditEnabled) {
		this.signEditEnabled = signEditEnabled;
	}
	/**
	 * @return the uUID
	 */
	public String getUUID() {
		return UUID;
	}
	/**
	 * @param uUID the uUID to set
	 */
	public void setUUID(String uUID) {
		UUID = uUID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}
	/**
	 * @param player the player to set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}
	

}
