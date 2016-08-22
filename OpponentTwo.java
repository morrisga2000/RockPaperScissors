package com.tiy.ssa.doyouwanttoplayagame;

import java.util.Random;

public class OpponentTwo extends UserClass {
	
	int num = 0;

	public OpponentTwo(int wins, int losses, int ties, boolean wantsToKeepPlaying, String throwDecision, String name,
			int num) {
		super(wins, losses, ties, wantsToKeepPlaying, throwDecision, name);
		this.num = num;
	}

	public OpponentTwo() {
		super();
	}

	public int getNum() {
		Random r = new Random();
	    num = r.nextInt(2);
		return num;
	}


}
