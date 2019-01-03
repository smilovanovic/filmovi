import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OsluskivacIzmeni implements ActionListener {

	private Lista lista;
	private int pozicija;
	private JTextField naziv;
	private JTextField reziser;
	private JTextField godina;
	private JTextField zanr;
	private JPanel panelUnos;
	private JPanel panelLista;

	public OsluskivacIzmeni(Lista l, int p, JTextField n, JTextField r, JTextField g, JTextField z, JPanel pU,
			JPanel pL) {

		lista = l;
		pozicija = p;
		naziv = n;
		reziser = r;
		godina = g;
		zanr = z;
		panelUnos = pU;
		panelLista = pL;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		int brojac = 1;
		Node tmp = lista.head;
		while (brojac != pozicija) {
			tmp = tmp.next;
			brojac++;

		}

		Film pom = tmp.getFilm();

		naziv.setText(pom.getNaziv());
		reziser.setText(pom.getReziser());
		godina.setText(String.valueOf(pom.getGodPrem()));
		zanr.setText(pom.getZanr());

		JButton dugmeIzmeni = new JButton("Izmeni");
		dugmeIzmeni.setBounds(230, 250, 100, 30);
		panelUnos.add(dugmeIzmeni);

		OsluskivacDugmeIzmeni oIzmeniDugme = new OsluskivacDugmeIzmeni(naziv, reziser, godina, zanr, pom);
		dugmeIzmeni.addActionListener(oIzmeniDugme);

		panelUnos.setVisible(true);
		panelLista.setVisible(false);

	}

}