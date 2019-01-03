import java.awt.Color;

import javax.swing.JFrame;

class Frejm extends JFrame {
	Frejm() {
		Lista l = new Lista();
		Film f = new Film("1", "1", 1, "1");
		l.addToHead(f);

		setLayout(null);
		setSize(800, 600);
		this.setBackground(new Color(192, 192, 192));
		setResizable(false);
		setLocationRelativeTo(null);

		PanelUnos p = new PanelUnos(l);
		p.setBounds(0, 0, 800, 600);
		p.setVisible(true);
		this.add(p);
	}
}
