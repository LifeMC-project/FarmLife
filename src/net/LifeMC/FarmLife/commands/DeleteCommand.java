package net.LifeMC.FarmLife.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.LifeMC.FarmLife.Utils;

public class DeleteCommand implements SubCommand{

	@Override
	public void execute(CommandSender sender, String[] args) {
		
		Player p = (Player)sender;
		Utils.deleteFarm(p);
		
	}

}
