import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelZanr extends JPanel {

	public PanelZanr() {

		setLayout(null);

		JLabel nazivL = new JLabel("Naziv filma");
		nazivL.setBounds(0, 10, 100, 30);
		this.add(nazivL);

		JLabel reziserL = new JLabel("Reziser filma");
		reziserL.setBounds(120, 10, 100, 30);
		this.add(reziserL);

		JLabel godinaL = new JLabel("Godina snimanja");
		godinaL.setBounds(240, 10, 100, 30);
		this.add(godinaL);

		JLabel zanrL = new JLabel("Zanr filma");
		zanrL.setBounds(360, 10, 100, 30);
		this.add(zanrL);

	}
}
