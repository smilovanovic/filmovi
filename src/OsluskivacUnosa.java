import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OsluskivacUnosa implements ActionListener{
	private JTextField nazivF;
	private JTextField reziserF;
	private JTextField godF;
	private JTextField zanrF;
	private Lista l;
	private PanelUnos panel;
		
	public OsluskivacUnosa(JTextField naz, JTextField rez, JTextField god, JTextField zan, Lista l, PanelUnos p) {
		nazivF = naz;
		reziserF = rez;
		godF = god;
		zanrF = zan;
		this.l = l;
		this.panel = p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Film f = new Film(nazivF.getText(), reziserF.getText(), Integer.parseInt(godF.getText()), zanrF.getText());
		l.addToHead(f);
		this.panel.clearInputs();
		this.panel.generateList();
	}
}
