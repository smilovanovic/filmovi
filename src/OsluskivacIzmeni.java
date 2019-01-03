import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OsluskivacIzmeni implements ActionListener {
	private Film film;
	private PanelUnos panelUnos;

	OsluskivacIzmeni(Film f, PanelUnos pU) {
		this.film = f;
		this.panelUnos = pU;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		panelUnos.setEdit(this.film);

	}

}