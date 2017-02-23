package com.antarescraft.kloudy.lite.slots;

import com.antarescraft.kloudy.lite.slots.events.LiteCommandEvent;
import com.antarescraft.kloudy.slots.Slots;

public class SlotsLite extends Slots
{
	@Override
	public void onEnable()
	{
		getCommand("slotslite").setExecutor(new LiteCommandEvent(this));
		
		super.onEnable();
	}
}