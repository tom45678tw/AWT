package awt.delegationEventModel.mouseListener;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseAdapter {
		static Frame fr=new Frame();
		static Label lab=new Label();
	   
		static Button btn=new Button("exit");
		static Button btn2=new Button("click me");
		
		static class listener extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {

			lab.setText("mouseClicked!!! "+e.getPoint());//¨úªº x,y®y¼Ð
		}
			
		}
		public static void main(String[] args) {
			
			fr.setLayout(null);

			fr.setSize(400,400);
			
			lab.setBounds(30, 50, 300, 20);
			btn2.setBounds(120, 120, 60, 20);
			btn.setBounds(120,190,60,20);
			btn2.addMouseListener(new listener());
			
			
	            btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {

					if(e.getSource()==btn) {
						System.exit(0);
					}
				}
			});
	            fr.add(lab);
	            fr.add(btn2);
	            fr.add(btn);
	            
	            fr.setVisible(true);
		}

	

}
