package com.tiy.ssa.doyouwanttoplayagame;

public abstract class PlayerClass {

	protected int wins = 0;
	protected int losses = 0;
	protected int ties = 0;
	protected boolean wantsToKeepPlaying = true;
	protected String throwDecision = null;

	public PlayerClass(int wins, int losses, int ties, boolean wantsToKeepPlaying, String throwDecision) {
		this.wins = wins;
		this.losses = losses;
		this.ties = ties;
		this.wantsToKeepPlaying = wantsToKeepPlaying;
		this.throwDecision = throwDecision;
	}

	public PlayerClass() {
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getTies() {
		return ties;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}

	public boolean isWantsToKeepPlaying() {
		return wantsToKeepPlaying;
	}

	public void setWantsToKeepPlaying(boolean wantsToKeepPlaying) {
		this.wantsToKeepPlaying = wantsToKeepPlaying;
	}

	public String getThrowDecision() {
		return throwDecision;
	}

	public void setThrowDecision(String throwDecision) {
		this.throwDecision = throwDecision;
	}

	
	
	
}
