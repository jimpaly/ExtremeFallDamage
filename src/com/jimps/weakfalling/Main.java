package com.jimps.weakfalling;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin " + JavaPlugin.getProvidingPlugin(this.getClass()).getName() + " has been enabled.");
		getServer().getPluginManager().registerEvents(new Listeners(), this);
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin " + JavaPlugin.getProvidingPlugin(this.getClass()).getName() + " has been disabled.");
	}
	
}
