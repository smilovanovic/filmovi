import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class OsluskivacDugmeIzmeni implements ActionListener {

	private JTextField naziv;
	private JTextField reziser;
	private JTextField godina;
	private JTextField zanr;
	private Film film;
	private PanelUnos panel;

	public OsluskivacDugmeIzmeni(JTextField n, JTextField r, JTextField g, JTextField z, Film f, PanelUnos p) {
		naziv = n;
		reziser = r;
		godina = g;
		zanr = z;
		film = f;
		panel = p;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		film.ucitajFilm(naziv.getText(), reziser.getText(), Integer.parseInt(godina.getText()), zanr.getText());
		panel.generateList();
		panel.clearInputs();
		panel.createAddEditButton(null);
	}

}
