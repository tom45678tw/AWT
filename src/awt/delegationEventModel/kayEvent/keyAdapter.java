package awt.delegationEventModel.kayEvent;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyAdapter {

	static Frame fr=new Frame();
	static Label la=new Label();
	static TextArea ta=new TextArea();
	static Button btn=new Button("exit");
	static class listener extends KeyAdapter{
      @Override
    public void keyReleased(KeyEvent e) {
         String text = ta.getText();
         String[] split = text.split("\\s");
         la.setText("�r��:"+split.length+" "+"�r����:"+text.length());	
         
      }
	
		
	}
	public static void main(String[] args) {

		fr.setLayout(null);
		fr.setSize(400,400);
		
		la.setBounds(30, 50, 200, 20);
		ta.setBounds(30, 80, 240, 60);
		btn.setBounds(30, 150, 50, 50);
		ta.addKeyListener(new listener());
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(e.getSource()==btn) {
					System.exit(0);
				}
			}
		});
		
		fr.add(la);
		fr.add(ta);
		fr.add(btn);
		
		fr.setVisible(true);
		
	}
}
