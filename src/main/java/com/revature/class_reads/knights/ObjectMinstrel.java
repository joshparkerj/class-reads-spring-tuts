package com.revature.class_reads.knights;

public class ObjectMinstrel implements Minstrel {

	@Override
	public void singBeforeQuest() {
		System.out.println(
				"Tra la la la la! There goes brave knight! Embarking on the quest! Figaro! Figaro figaro figarooooooo!");
	}

	@Override
	public void singAfterQuest() {
		System.out.println("Bibbity bobbity boo! Here from the quest, comes you know who!");
	}

}
