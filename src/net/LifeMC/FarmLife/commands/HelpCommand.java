package net.LifeMC.FarmLife.commands;

import org.bukkit.command.CommandSender;

import net.LifeMC.FarmLife.Utils;

public class HelpCommand implements SubCommand {
    @Override
    public void execute(CommandSender sender, String[] args) {

        sender.sendMessage(Utils.coloroze("&cThis will be the help message"));
        
    }
}
