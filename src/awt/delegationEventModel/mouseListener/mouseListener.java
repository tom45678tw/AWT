package awt.delegationEventModel.mouseListener;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import org.w3c.dom.events.MouseEvent;

public class mouseListener {

	static Frame fr=new Frame();
	static Label lab=new Label();
   
	static Button btn=new Button("exit");
	static Button btn2=new Button("click me");
	
	static class listener implements MouseListener{

		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {

			lab.setText("mouseClick!!");//按下 及 放下 
		}

		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {

			lab.setText("mousePressed!!!");//滑鼠按下
		}

		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {

			lab.setText("mouseReleased!!!");//滑鼠放下
		}

		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {

			lab.setText("mouseEntered!!");//滑鼠移入
		}

		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {

			lab.setText("mouseExited!!!");//滑鼠離開
		}
		
	}
	public static void main(String[] args) {
		
		fr.setLayout(null);

		fr.setSize(400,400);
		
		lab.setBounds(30, 50, 200, 20);
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
