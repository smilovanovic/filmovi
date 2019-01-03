import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OsluskivacZanra implements ActionListener {

	private JPanel panel;
	private JPanel panel1;
	private JPanel panelZ;
	private JTextField textfield;
	private Lista l;

	public OsluskivacZanra(JPanel p, JPanel pz, JPanel p1, JTextField tf, Lista l) {

		panel = p;
		panelZ = pz;
		panel1 = p1;
		textfield = tf;
		this.l = l;

	}

	public void actionPerformed(ActionEvent e) {

		panelZ.setVisible(true);
		panel1.setVisible(false);
		panel.setVisible(true);

		int nazivW = 100;
		int reziserW = 100;
		int godW = 50;
		int zanrW = 80;

		int rowH = 30;

		int offsetN = 130;
		int offsetR = 130;
		int offsetG = 110;
		int offsetZ = 90;

		int offsetY = 40;

		int br = 0;
		for (Node tmp = l.head; tmp != null; tmp = tmp.next) {
			if (tmp.info.getZanr().equals(textfield.getText())) {

				JLabel naziv = new JLabel();
				naziv.setText(tmp.info.getNaziv());
				naziv.setBounds(20, 30 + br * offsetY, nazivW, rowH);
				panel.add(naziv);

				JLabel reziser = new JLabel();
				reziser.setText(tmp.info.getReziser());
				reziser.setBounds(naziv.getX() + offsetN, naziv.getY(), reziserW, rowH);
				panel.add(reziser);

				JLabel godina = new JLabel();
				godina.setText("" + tmp.info.getGodPrem());
				godina.setBounds(reziser.getX() + offsetR, reziser.getY(), godW, rowH);
				panel.add(godina);

				JLabel zanr = new JLabel();
				zanr.setText(tmp.info.getZanr());
				zanr.setBounds(godina.getX() + offsetG, godina.getY(), zanrW, rowH);
				panel.add(zanr);

				br++;

			}
		}

	}

}
