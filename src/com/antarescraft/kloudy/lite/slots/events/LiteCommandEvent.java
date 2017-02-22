package com.antarescraft.kloudy.lite.slots.events;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.antarescraft.kloudy.hologuiapi.plugincore.command.CommandHandler;
import com.antarescraft.kloudy.slots.Slots;
import com.antarescraft.kloudy.slots.events.CommandEvent;

public class LiteCommandEvent extends CommandEvent
{
	public LiteCommandEvent(Slots plugin)
	{
		super(plugin);
	}
	
	@CommandHandler(description = "Opens the Slots GUI",
			mustBePlayer = true, permission = "slots.play", subcommands = "play")
	public void play(CommandSender sender, String[] args)
	{
		Player player = (Player)sender;
		
		if(!slots.isPlaying(player))
		{
			
		}
		else
		{
			player.sendMessage(config.getAlreadyPlayingMessage());
		}
	}
}