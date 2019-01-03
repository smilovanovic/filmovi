import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class OsluskivacDugmeIzmeni implements ActionListener {

	JTextField naziv;
	JTextField reziser;
	JTextField godina;
	JTextField zanr;
	private Film film;

	public OsluskivacDugmeIzmeni(JTextField n, JTextField r, JTextField g, JTextField z, Film f) {
		naziv = n;
		reziser = r;
		godina = g;
		zanr = z;
		film = f;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		film.ucitajFilm(naziv.getText(), reziser.getText(), Integer.parseInt(godina.getText()), zanr.getText());
	}

}
