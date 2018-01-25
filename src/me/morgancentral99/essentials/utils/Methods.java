package me.morgancentral99.essentials.utils;

import java.util.logging.Logger;

import org.bukkit.Bukkit;

public class Methods {
	
	public enum LogLevel {
		INFO, SEVERE, WARNING, DEBUG;
	}
	private static String LogINFOConsole = "[Essentials Core]: ";
	private static Logger log2 = Bukkit.getLogger();
	public static void log(LogLevel level, String s) {
		if(level.equals(LogLevel.INFO)) {
			log2.info(LogINFOConsole + "Info: " + s);
		} else if(level.equals(LogLevel.WARNING)) {
			log2.info(LogINFOConsole + "Warning:" + s);
		} else if(level.equals(LogLevel.SEVERE)) {
			log2.info(LogINFOConsole + "Severe:" + s);
		} else if(level.equals(LogLevel.DEBUG)) {
			log2.info(LogINFOConsole + "Debug:" + s);
		}
	}

}
