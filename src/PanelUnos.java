import java.awt.*;

import javax.swing.*;

class PanelUnos extends JPanel {
	private PanelLista p1;
	private Lista l;
	private JTextField nazivF = new JTextField();
	private JTextField reziserF = new JTextField();
	private JTextField godinaF = new JTextField();
	private JTextField zanrF = new JTextField();
	private JButton dugme;

	PanelUnos(Lista l) {
		this.l = l;

		setLayout(null);
		this.setBackground(new Color(192, 192, 192));

		JLabel nazivL = new JLabel("Naziv filma");
		nazivL.setBounds(30, 10, 100, 30);
		this.add(nazivL);
		nazivF.setBounds(150, 10, 100, 30);
		this.add(nazivF);

		JLabel reziserL = new JLabel("Reziser filma");
		reziserL.setBounds(30, 60, 100, 30);
		this.add(reziserL);
		reziserF.setBounds(150, 60, 100, 30);
		this.add(reziserF);

		JLabel godinaL = new JLabel("Godina premijere");
		godinaL.setBounds(30, 110, 100, 30);
		this.add(godinaL);
		godinaF.setBounds(150, 110, 100, 30);
		this.add(godinaF);

		JLabel zanrL = new JLabel("Zanr filma");
		zanrL.setBounds(30, 160, 100, 30);
		this.add(zanrL);
		zanrF.setBounds(150, 160, 100, 30);
		this.add(zanrF);

		this.createAddEditButton(null);
	}

	public void createAddEditButton(Film f) {
		if (this.dugme != null) {
			this.remove(this.dugme);
		}
		dugme = new JButton("Snimi");
		dugme.setBounds(150, 210, 100, 30);
		this.add(dugme);

		this.generateList();

		if(f != null) {
			OsluskivacDugmeIzmeni o = new OsluskivacDugmeIzmeni(
					nazivF,
					reziserF,
					godinaF,
					zanrF,
					f,
					this
			);
			dugme.addActionListener(o);
		} else {
			OsluskivacUnosa o = new OsluskivacUnosa(
					nazivF,
					reziserF,
					godinaF,
					zanrF,
					l,
					this
			);
			dugme.addActionListener(o);
		}
	}

	public void clearInputs() {
		nazivF.setText("");
		reziserF.setText("");
		godinaF.setText("");
		zanrF.setText("");
	}

	public void generateList() {
		if (this.p1 != null) {
			this.remove(this.p1);
		}
		this.p1 = new PanelLista(this.l, this);
		this.p1.setBounds(0, 300, 800, 300);
		this.p1.setVisible(true);
		this.add(this.p1);
		this.revalidate();
		this.repaint();
	}

	public void setEdit(Film f) {
		this.nazivF.setText(f.getNaziv());
		this.reziserF.setText(f.getReziser());
		this.godinaF.setText(String.valueOf(f.getGodPrem()));
		this.zanrF.setText(f.getZanr());
		this.createAddEditButton(f);
	}
}
