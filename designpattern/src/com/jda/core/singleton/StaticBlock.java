package com.jda.core.singleton;

public class StaticBlock {
	private static StaticBlock instance;

	private StaticBlock() {
	}

	static {
		try {
			instance = new StaticBlock();
		} catch (Exception e) {
			System.out.print("Instance could not be created!");
		}
	}

	public static StaticBlock getInstance() {
		return instance;
	}

}
