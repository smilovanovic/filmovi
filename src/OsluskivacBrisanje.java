import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OsluskivacBrisanje implements ActionListener {

	private Lista l;
	private int pozicija;

	public OsluskivacBrisanje(Lista l, int pozicija) {

		this.l = l;
		this.pozicija = pozicija;
	}

	public void actionPerformed(ActionEvent e) {

		l.deleteElement(pozicija);
	}

}
