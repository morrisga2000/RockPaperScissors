package com.tiy.ssa.doyouwanttoplayagame;
import java.util.*;
import java.util.Random;
import java.util.Scanner;


public class OpponentOne extends UserClass {
	int num = 0;

	public OpponentOne(int wins, int losses, int ties, boolean wantsToKeepPlaying, String throwDecision, String name,
			int num) {
		super(wins, losses, ties, wantsToKeepPlaying, throwDecision, name);
		this.num = num;
	}

	public OpponentOne() {
		super();
	}

	public int getNum() {
		Random r = new Random();
	    num = r.nextInt(3);
		return num;
	}
	
	
}
