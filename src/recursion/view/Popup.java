package recursion.view;

import javax.swing.*;

public class Popup {
	private ImageIcon icon;
	private String windowTitle;
	public Popup() {
		windowTitle = "Recursion";
		icon = new ImageIcon(getClass().getResource("/recursion/view/recursion-tree.png"));
	}
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message, windowTitle, JOptionPane.INFORMATION_MESSAGE, icon);
	}
}
