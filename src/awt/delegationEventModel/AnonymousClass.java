package awt.delegationEventModel;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {


	static Frame fr=new Frame("Anonymous Class");
	static Button btn=new Button("Click me");
	public static void main(String[] args) {
       fr.setLayout(new FlowLayout());
       fr.setSize(200,120);
       fr.setBackground(Color.GRAY);
       
       btn.addActionListener(new ActionListener() {	
		public void actionPerformed(ActionEvent e) {
             fr.setBackground(Color.yellow);			
		}
	});
       fr.add(btn);
       fr.setVisible(true);
	}

}
