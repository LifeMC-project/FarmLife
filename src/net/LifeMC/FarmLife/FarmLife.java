package net.LifeMC.FarmLife;

import net.LifeMC.FarmLife.commands.MyFarm;
import net.LifeMC.FarmLife.gameplay.EventListener;
import net.LifeMC.FarmLife.menus.MenuEventListener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

public class FarmLife extends JavaPlugin {
	//Declare and get stuff
	public Logger log = Bukkit.getLogger();

	public List<UUID> staffchat = new ArrayList<>();

	public static FarmLife getInstance() {
		if ((Bukkit.getServer().getPluginManager().getPlugin("FarmLife") instanceof FarmLife)) {
			return (FarmLife) Bukkit.getServer().getPluginManager().getPlugin("FarmLife");
		}
		return null;
	}

	public void onEnable(){
		log.info("[FarmLife] have been enabled");

		/**
		 //Disable the plugin one referenced library can't be loaded.
		PluginManager manager = Bukkit.getServer().getPluginManager();
        final Plugin plotsquared = manager.getPlugin("PlotSquared");
        final Plugin worldguard = manager.getPlugin("WorldGuard");
        final Plugin worldedit = manager.getPlugin("WorldEdit");
        final Plugin titlemanager = manager.getPlugin("TitleManager");
        final Plugin permissionex = manager.getPlugin("PermissionEx");

		 if(plotsquared != null && !plotsquared.isEnabled()||worldguard != null && !worldguard.isEnabled()||worldedit != null && !worldedit.isEnabled()||titlemanager != null && !titlemanager.isEnabled()||permissionex != null && !permissionex.isEnabled()){
		 log.severe("[FarmLife] Could not load a library. Disabling plugin...");
            manager.disablePlugin(this);
            return;
        }*/

		//Events
		Utils.registerListener(new EventListener(this));
		Utils.registerListener(new MenuEventListener(this));

		//Commands
		//getCommand("farmlife").setExecutor(new CommandHandler());
		getCommand("myfarm").setExecutor(new MyFarm());
	}

	public void onDisable(){
		log.info("[FarmLife] have been disabled");
	}
}
