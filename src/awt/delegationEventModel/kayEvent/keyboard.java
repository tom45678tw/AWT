package awt.delegationEventModel.kayEvent;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyboard {

	static Frame fr=new Frame();
	static Label l=new Label();
	static TextArea a=new TextArea();
	static TextArea a1=new TextArea();
	static class keyListener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {

//			l.setText("\nkey Typed =(ActionKey) " +e.isActionKey()+":"+e.getKeyChar()+":"+e.getKeyCode());
     		
		}

		@Override
		public void keyPressed(KeyEvent e) {
			l.setText("\nkey Typed =(ActionKey) " +e.isActionKey()+":"+e.getKeyChar()+":"+e.getKeyCode());
//		l.setText("key Pressed: (key Char) "+e.getKeyChar());
		}

		@Override
		public void keyReleased(KeyEvent e) {

//			l.setText("Key Release:(KeyCode) "+e.getKeyCode());
		}
		
	}
	
	public static void main(String[] args) {

		fr.setLayout(null);
		fr.setSize(500,400);
		l.setBounds(50,50,250,100);
		l.setBackground(Color.yellow);
		a.setBounds(50, 200, 250, 100);
		
		l.addKeyListener(new keyListener());
		a.addKeyListener(new keyListener());
		
		fr.add(l);
		fr.add(a);
		
		fr.setVisible(true);

		
		
	}

}
