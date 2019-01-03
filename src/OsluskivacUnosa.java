import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OsluskivacUnosa implements ActionListener{
		private JTextField nazivF;
		private JTextField reziserF;
		private JTextField godF;
		private JTextField zanrF;
		private Lista l;
		
		public OsluskivacUnosa(JTextField naz, JTextField rez, JTextField god, JTextField zan, Lista l) {
			nazivF=naz;
			reziserF=rez;
			godF=god;
			zanrF=zan;
			this.l=l;
		}
		
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Film f=new Film(nazivF.getText(), reziserF.getText(), Integer.parseInt(godF.getText()), zanrF.getText());
		l.addToHead(f);
		nazivF.setText("");
		reziserF.setText("");
		godF.setText("");
		zanrF.setText("");
		
	}

}
