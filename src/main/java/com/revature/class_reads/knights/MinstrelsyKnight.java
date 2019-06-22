package com.revature.class_reads.knights;

public class MinstrelsyKnight implements Knight {

	private Quest quest;
	private ObjectMinstrel minstrel;

	public MinstrelsyKnight(Quest quest, ObjectMinstrel minstrel) {
		this.quest = quest;
		this.minstrel = minstrel;
	}

	public MinstrelsyKnight() {
		super();
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() {
		minstrel.singBeforeQuest();
		quest.embark();
		minstrel.singAfterQuest();
	}

}
