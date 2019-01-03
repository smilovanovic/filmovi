import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OsluskivacBrisanje implements ActionListener {

	private Lista l;
	private int pozicija;
	private PanelUnos panelUnos;

	OsluskivacBrisanje(Lista l, int pozicija, PanelUnos pU) {
		this.l = l;
		this.pozicija = pozicija;
		this.panelUnos = pU;
	}

	public void actionPerformed(ActionEvent e) {
		l.deleteElement(pozicija);
		this.panelUnos.generateList();
	}

}
