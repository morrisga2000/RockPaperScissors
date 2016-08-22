package com.tiy.ssa.doyouwanttoplayagame;

import java.util.Random;

public class OpponentThree extends UserClass {
	int num = 0;

	public OpponentThree(int wins, int losses, int ties, boolean wantsToKeepPlaying, String throwDecision, String name,
			int num) {
		super(wins, losses, ties, wantsToKeepPlaying, throwDecision, name);
		this.num = num;
	}

	public OpponentThree() {
		super();
	}

	public int getNum() {
		Random r = new Random();
	    num = r.nextInt(2);
	    num++;
		return num;
	}
	
	
	

}
