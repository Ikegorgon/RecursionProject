package recursion.controller;

import recursion.view.*;

public class RecursionController {
	private Popup display;
	
	public RecursionController() {
		display = new Popup();
	}
	public void start() {
		recursivePop("Display Sample");
	}
	private void recursivePop(String message) {
		if (message.length() == 1) {
			display.displayMessage(message);
		} else {
			recursivePop(message.substring(1, message.length()));
			display.displayMessage(message);
		}
	}
}
