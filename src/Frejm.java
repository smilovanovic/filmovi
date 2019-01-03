import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frejm extends JFrame {
	public Lista l = new Lista();

	public Frejm() {

		setLayout(null);
		setSize(800, 600);
		this.setBackground(new Color(192, 192, 192));
		setResizable(false);
		setLocationRelativeTo(null);

		PanelUnos p = new PanelUnos();
		p.setBounds(0, 0, 800, 600);
		p.setVisible(true);
		this.add(p);

		PanelLista p1 = new PanelLista();
		p1.setBounds(0, 0, 800, 600);
		p1.setVisible(false);
		this.add(p1);

		PanelDugme pd = new PanelDugme();
		pd.setBounds(680, 300, 100, 100);

		JButton dugmePromeni = new JButton("Lista");
		dugmePromeni.setBounds(0, 0, 100, 30);
		pd.add(dugmePromeni);
		dugmePromeni.setVisible(true);
		this.add(pd);

		JButton dugme = new JButton("Upisi u listu");
		dugme.setBounds(120, 250, 100, 30);
		p.add(dugme);
		this.add(p);

		OsluskivacUnosa ou = new OsluskivacUnosa(p.nazivF, p.reziserF, p.godinaF, p.zanrF, l);
		dugme.addActionListener(ou);

		PanelZanr pz = new PanelZanr();
		pz.setBounds(0, 0, 680, 500);
		this.add(pz);
		pz.setVisible(false);

		PanelZanrLista pzl = new PanelZanrLista();
		pzl.setBounds(680, 300, 120, 100);
		this.add(pzl);
		pzl.setVisible(false);

		JButton promeniDugme1 = new JButton("Forma");
		promeniDugme1.setBounds(0, 0, 100, 30);
		pzl.add(promeniDugme1);

		JTextField textZanr = new JTextField();
		textZanr.setBounds(0, 40, 100, 30);
		pzl.add(textZanr);

		JButton dugmeZanr = new JButton("Pretrazi");
		dugmeZanr.setBounds(0, 80, 100, 30);
		pzl.add(dugmeZanr);
		pzl.setVisible(false);

		OsluskivacPromena op = new OsluskivacPromena(p, p1, dugmePromeni, l, pzl, p.nazivF, p.reziserF, p.godinaF,
				p.zanrF);
		dugmePromeni.addActionListener(op);

		OsluskivacPromena1 op1 = new OsluskivacPromena1(p, p1, dugmePromeni, pzl);
		promeniDugme1.addActionListener(op1);

		OsluskivacZanra oz = new OsluskivacZanra(pz, pzl, p1, textZanr, l);
		dugmeZanr.addActionListener(oz);

	}
}
