package com.tiy.ssa.doyouwanttoplayagame;

public class OpponentAlwaysSame extends UserClass {

	int num = 0;

	public OpponentAlwaysSame(int wins, int losses, int ties, boolean wantsToKeepPlaying, String throwDecision,
			String name, int num) {
		super(wins, losses, ties, wantsToKeepPlaying, throwDecision, name);
		this.num = num;
	}

	public OpponentAlwaysSame() {
		super();
	}

	public int getNum() {
		return 1;
	}
	
	
	
}
