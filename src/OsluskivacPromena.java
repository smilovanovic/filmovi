import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OsluskivacPromena implements ActionListener {

	private JPanel panel;
	private JPanel panel1;
	private JButton dugme;
	private Lista l;
	private int y;
	private JPanel panel2;
	private JTextField naziv;
	private JTextField reziser;
	private JTextField godina;
	private JTextField zanr;

	public OsluskivacPromena(JPanel p, JPanel p1, JButton d, Lista l, JPanel p2, JTextField naziv, JTextField reziser,
			JTextField godina, JTextField zanr) {

		panel = p;
		panel1 = p1;
		dugme = d;
		this.l = l;
		this.y = 40;
		panel2 = p2;
		this.naziv = naziv;
		this.reziser = reziser;
		this.godina = godina;
		this.zanr = zanr;
	}

	public void actionPerformed(ActionEvent arg0) {

		panel1.removeAll();
		this.y = 40;
		panel1.setLayout(null);
		panel.setVisible(false);
		panel1.setVisible(true);
		panel2.setVisible(true);
		dugme.setVisible(false);

		OsluskivacBrisanje oBrisanje[] = new OsluskivacBrisanje[l.numOfEl()];

		JButton obrisiIzListe[] = new JButton[l.numOfEl()];

		OsluskivacIzmeni oIzmeni[] = new OsluskivacIzmeni[l.numOfEl()];

		JButton izmeniFilm[] = new JButton[l.numOfEl()];

		JLabel nazivL = new JLabel("Naziv filma");
		nazivL.setBounds(0, 10, 100, 30);
		panel1.add(nazivL);

		JLabel reziserL = new JLabel("Reziser filma");
		reziserL.setBounds(120, 10, 100, 30);
		panel1.add(reziserL);

		JLabel godinaL = new JLabel("Godina snimanja");
		godinaL.setBounds(240, 10, 100, 30);
		panel1.add(godinaL);

		JLabel zanrL = new JLabel("Zanr filma");
		zanrL.setBounds(360, 10, 100, 30);
		panel1.add(zanrL);

		int brojac = 0;

		for (Node tmp = l.head; tmp != null; tmp = tmp.next) {

			// if (tmp.getFilm().getVisible() == false) {
			JLabel lIme = new JLabel(tmp.getFilm().getNaziv());
			lIme.setBounds(0, y, 100, 30);
			panel1.add(lIme);

			JLabel lReziser = new JLabel(tmp.getFilm().getReziser());
			lReziser.setBounds(120, y, 100, 30);
			panel1.add(lReziser);

			JLabel lGodina = new JLabel(String.valueOf(tmp.getFilm().getGodPrem()));
			lGodina.setBounds(240, y, 100, 30);
			panel1.add(lGodina);

			JLabel lZanr = new JLabel(tmp.getFilm().getZanr());
			lZanr.setBounds(360, y, 100, 30);
			panel1.add(lZanr);

			obrisiIzListe[brojac] = new JButton("Obrisi");
			obrisiIzListe[brojac].setBounds(480, y, 70, 30);
			panel1.add(obrisiIzListe[brojac]);

			izmeniFilm[brojac] = new JButton("Izmeni");
			izmeniFilm[brojac].setBounds(580, y, 80, 30);
			panel1.add(izmeniFilm[brojac]);

			oIzmeni[brojac] = new OsluskivacIzmeni(l, brojac + 1, naziv, reziser, godina, zanr, panel, panel1);

			izmeniFilm[brojac].addActionListener(oIzmeni[brojac]);

			oBrisanje[brojac] = new OsluskivacBrisanje(l, brojac + 1);

			obrisiIzListe[brojac].addActionListener(oBrisanje[brojac]);
			brojac++;

			y = y + 40;
			// tmp.getFilm().setVisible();

			// }
		}
	}

}
