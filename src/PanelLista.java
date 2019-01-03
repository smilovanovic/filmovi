import java.awt.Color;

import javax.swing.*;

class PanelLista extends JPanel {
	PanelLista(Lista l, PanelUnos pU) {
		setLayout(null);
		this.setBackground(new Color(165, 165, 165));

		JLabel nazivL = new JLabel("Naziv filma");
		nazivL.setBounds(30, 10, 100, 30);
		this.add(nazivL);

		JLabel reziserL = new JLabel("Reziser filma");
		reziserL.setBounds(150, 10, 100, 30);
		this.add(reziserL);

		JLabel godinaL = new JLabel("Godina snimanja");
		godinaL.setBounds(270, 10, 100, 30);
		this.add(godinaL);

		JLabel zanrL = new JLabel("Zanr filma");
		zanrL.setBounds(390, 10, 100, 30);
		this.add(zanrL);

		int brojac = 0;

		for (Node tmp = l.head; tmp != null; tmp = tmp.next) {

			int y = 40 * (brojac + 1);

			JLabel lIme = new JLabel(tmp.getFilm().getNaziv());
			lIme.setBounds(30, y, 100, 30);
			this.add(lIme);

			JLabel lReziser = new JLabel(tmp.getFilm().getReziser());
			lReziser.setBounds(150, y, 100, 30);
			this.add(lReziser);

			JLabel lGodina = new JLabel(String.valueOf(tmp.getFilm().getGodPrem()));
			lGodina.setBounds(270, y, 100, 30);
			this.add(lGodina);

			JLabel lZanr = new JLabel(tmp.getFilm().getZanr());
			lZanr.setBounds(390, y, 100, 30);
			this.add(lZanr);

			JButton obrisiIzListe = new JButton("Obrisi");
			obrisiIzListe.setBounds(510, y, 70, 30);
			this.add(obrisiIzListe);

			JButton izmeniFilm = new JButton("Izmeni");
			izmeniFilm.setBounds(600, y, 80, 30);
			this.add(izmeniFilm);

			OsluskivacIzmeni oIzmeni = new OsluskivacIzmeni(tmp.info, pU);
			izmeniFilm.addActionListener(oIzmeni);

			OsluskivacBrisanje oBrisanje = new OsluskivacBrisanje(l, brojac + 1, pU);
			obrisiIzListe.addActionListener(oBrisanje);

			brojac++;
		}
	}

}
