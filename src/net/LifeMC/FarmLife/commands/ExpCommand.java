package net.LifeMC.FarmLife.commands;

import org.bukkit.command.CommandSender;

import net.LifeMC.FarmLife.Utils;

public class ExpCommand implements SubCommand{


	@Override
	public void execute(CommandSender sender, String[] args) {
		if(args.length == 3) {
			try {
				if(args[0].equalsIgnoreCase("player")) {
					
				}
				else if(args[0].equalsIgnoreCase("farm")) {

				}
				else sender.sendMessage(Utils.coloroze("&cInvalid argument. Valids are: player, farm."));
			}
			catch(Exception ex) {}
		}
		else sender.sendMessage("Missing argument(s).");

	}

}
