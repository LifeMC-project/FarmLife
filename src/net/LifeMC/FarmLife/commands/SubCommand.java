package net.LifeMC.FarmLife.commands;

import org.bukkit.command.CommandSender;


//This is so we can do SubCommand.execute();

public interface SubCommand {

    void execute(CommandSender sender, String[] args);
}
