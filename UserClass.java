package com.tiy.ssa.doyouwanttoplayagame;

public class UserClass extends PlayerClass{

	protected String name = null;

	public UserClass(int wins, int losses, int ties, boolean wantsToKeepPlaying, String throwDecision, String name) {
		super(wins, losses, ties, wantsToKeepPlaying, throwDecision);
		this.name = name;
	}

	public UserClass() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
