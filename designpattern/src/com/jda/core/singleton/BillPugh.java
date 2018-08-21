package com.jda.core.singleton;

public class BillPugh {

	private BillPugh() {
	}

	private static class Helper {
		private static final BillPugh INSTANCE = new BillPugh();
	}

	public static BillPugh getInstance() {
		return Helper.INSTANCE;
	}
}
