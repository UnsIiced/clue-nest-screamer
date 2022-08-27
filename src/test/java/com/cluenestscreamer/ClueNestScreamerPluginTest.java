package com.cluenestscreamer;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ClueNestScreamerPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ClueNestScreamerPlugin.class);
		RuneLite.main(args);
	}
}