import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OsluskivacPromena1 implements ActionListener {

	private JPanel panel;
	private JPanel panel1;
	private JButton dugme;
	private JPanel panel2;

	public OsluskivacPromena1(JPanel p, JPanel p1, JButton d, JPanel p2) {
		panel = p;
		panel1 = p1;
		dugme = d;
		panel2 = p2;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		panel.setVisible(true);
		panel1.setVisible(false);
		dugme.setVisible(true);
		panel2.setVisible(false);
	}

}
