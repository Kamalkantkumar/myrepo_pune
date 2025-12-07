package com.technoelevate.templates;

public abstract class Game {
	abstract void init();
	abstract void start();
	
	void play() {
		init();
		start();
	}

}
