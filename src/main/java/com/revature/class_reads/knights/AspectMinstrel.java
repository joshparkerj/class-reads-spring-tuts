package com.revature.class_reads.knights;

public class AspectMinstrel implements Minstrel {

	@Override
	public void singBeforeQuest() {
		System.out.println("AOP AOP AOP! Tra la la before the quest!");
	}

	@Override
	public void singAfterQuest() {
		System.out.println("The quest is done! Do re mi! Do fa sol! AOP AOP AOP!");
	}

}
