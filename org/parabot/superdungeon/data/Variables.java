package org.parabot.superdungeon.data;

import java.util.ArrayList;

import org.parabot.environment.scripts.framework.Strategy;

public class Variables {
	private static ArrayList<Strategy> strategies = new ArrayList<>();

	public static void setStrategy(Strategy e) {
		strategies.add(e);
	}

	public static ArrayList<Strategy> getStrategyArray() {
		return strategies;

	}

}