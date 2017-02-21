package com.antarescraft.kloudy.slotslite;

import com.antarescraft.kloudy.slots.Slots;
import com.antarescraft.kloudy.slots.events.CommandEvent;

public class SlotsLite extends Slots
{
	@Override
	public void onEnable()
	{
		getCommand("slots").setExecutor(new CommandEvent(this));
	}
}