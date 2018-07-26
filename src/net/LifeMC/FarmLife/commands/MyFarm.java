package net.LifeMC.FarmLife.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.LifeMC.FarmLife.Utils;

import java.util.HashMap;
import java.util.Map;

public class MyFarm implements CommandExecutor{

	Map<String, SubCommand> commands = new HashMap<>();

	//Register other commands using "commands.put("command", new Command());"
	public MyFarm() {
		commands.put("help", new HelpCommand());
		commands.put("experience", new ExpCommand());
		commands.put("delete", new DeleteCommand());
	}

	//Main plugin command.
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player p = (Player)sender;

		if (cmd.getName().equalsIgnoreCase("myfarm")) {
			if (args.length == 0) {
				if (!Utils.farmExist(p)) {
					Utils.claimFarm(p);
				} else Utils.teleportToFarm(p);


			} else if (commands.containsKey(args[0])) {

				commands.get(args[0]).execute(sender, args);
			} else {
				p.sendMessage(Utils.coloroze("&cInvalid subcommand."));
			}
		}
		return false;
	}
}