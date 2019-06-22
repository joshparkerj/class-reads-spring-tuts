package com.revature.class_reads.knights;

import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = Mockito.mock(Quest.class);
		ObjectMinstrel mockMinstrel = Mockito.mock(ObjectMinstrel.class);
		new MinstrelsyKnight(mockQuest, mockMinstrel).embarkOnQuest();
		Mockito.verify(mockQuest, Mockito.times(1)).embark();
	}

}
