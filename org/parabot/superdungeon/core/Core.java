package org.parabot.superdungeon.core;

import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.superdungeon.data.Variables;

@ScriptManifest(author = "El Maestro & Bears", category = Category.OTHER, description = "Finishes hard dungeons quickly and effectively.", name = "SuperDungeon", servers = { "Soulsplit" }, version = 0.1)
public class Core extends Script {

	public boolean onExecute() {
		provide(Variables.getStrategyArray());
		return true;
	}

	public void onFinish() {

	}

}
