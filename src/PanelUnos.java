import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelUnos extends JPanel {
	public JTextField nazivF;
	public JTextField reziserF;
	public JTextField godinaF;
	public JTextField zanrF;

	public PanelUnos() {

		setLayout(null);
		this.setBackground(new Color(192, 192, 192));

		JLabel nazivL = new JLabel("Naziv filma");
		nazivL.setBounds(30, 10, 100, 30);
		this.add(nazivL);
		nazivF = new JTextField();
		nazivF.setBounds(150, 10, 100, 30);
		this.add(nazivF);

		JLabel reziserL = new JLabel("Reziser filma");
		reziserL.setBounds(30, 60, 100, 30);
		this.add(reziserL);
		reziserF = new JTextField();
		reziserF.setBounds(150, 60, 100, 30);
		this.add(reziserF);

		JLabel godinaL = new JLabel("Godina premijere");
		godinaL.setBounds(30, 110, 100, 30);
		this.add(godinaL);
		godinaF = new JTextField();
		godinaF.setBounds(150, 110, 100, 30);
		this.add(godinaF);

		JLabel zanrL = new JLabel("Zanr filma");
		zanrL.setBounds(30, 160, 100, 30);
		this.add(zanrL);
		zanrF = new JTextField();
		zanrF.setBounds(150, 160, 100, 30);
		this.add(zanrF);

	}
}
