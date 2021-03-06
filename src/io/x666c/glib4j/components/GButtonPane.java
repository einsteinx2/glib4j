package io.x666c.glib4j.components;

import java.awt.FlowLayout;
import javax.swing.JPanel;

public class GButtonPane extends JPanel {
	
	public GButtonPane(GButton... btns) {
		setLayout(new FlowLayout());
		for (GButton jButton : btns) {
			add(jButton.getBtn());
		}
	}
}