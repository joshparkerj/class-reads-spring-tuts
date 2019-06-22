package com.revature.class_reads.knights;

public class DamselRescuingKnight implements Knight {

	private RescueDamselQuest quest;

	public DamselRescuingKnight() {
		quest = new RescueDamselQuest();
	}

	@Override
	public void embarkOnQuest() {
		quest.embark();
	}

}
