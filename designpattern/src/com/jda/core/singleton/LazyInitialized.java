package com.jda.core.singleton;

public class LazyInitialized {
	private static LazyInitialized instance;
	
	private LazyInitialized(){}
	
	public static LazyInitialized getInstance(){
		if (instance == null)
		{
			instance = new LazyInitialized();
		}
		return instance;
	}
}
