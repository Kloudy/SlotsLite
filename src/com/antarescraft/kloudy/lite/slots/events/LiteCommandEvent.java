package com.antarescraft.kloudy.lite.slots.events;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.antarescraft.kloudy.hologuiapi.plugincore.command.CommandHandler;
import com.antarescraft.kloudy.hologuiapi.plugincore.command.CommandParser;
import com.antarescraft.kloudy.promo.HoloGUIPromo;
import com.antarescraft.kloudy.slots.Slots;
import com.antarescraft.kloudy.slots.events.CommandEvent;
import com.antarescraft.kloudy.slots.pagemodels.SlotsPageModel;

public class LiteCommandEvent extends CommandEvent
{
	public LiteCommandEvent(Slots plugin)
	{
		super(plugin);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		return CommandParser.parseCommand(slots, this, "slotslite", cmd.getName(), sender, args);
	}
	
	@Override
	@CommandHandler(description = "Opens the Slots GUI",
			mustBePlayer = true, permission = "slotslite.play", subcommands = "play")
	public void play(CommandSender sender, String[] args)
	{
		Player player = (Player)sender;
				
		if(!slots.isPlaying(player))
		{
			HoloGUIPromo.openPromoPage(slots, player, new SlotsPageModel(slots, slots.getGUIPage("slot-machine"), player));
		
			slots.isPlaying(player, true);
		}
		else
		{
			player.sendMessage(config.getAlreadyPlayingMessage());
		}
	}
}