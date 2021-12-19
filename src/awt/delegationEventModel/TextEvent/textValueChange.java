package awt.delegationEventModel.TextEvent;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class textValueChange {

	static Frame fr=new Frame("TextEvent");
	static TextArea t=new TextArea("",10,40);
	static TextArea t2=new TextArea("",10,40);
	
	static class myListener implements TextListener{

		@Override
		public void textValueChanged(TextEvent e) {
           t2.setText(t.getText());//�N t ����r�ƻs�� t2
		}
		
	}
	public static void main(String[] args) {

		fr.setLayout(new GridLayout(2,1));
		fr.setSize(500,440);
		
		t.addTextListener(new myListener());
		
		t2.setEditable(false);//������J
		t2.setBackground(Color.yellow);//�Ыe������
		
		Button btn = new Button("exit");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if((Button)e.getSource()==btn) {
					System.exit(0);
				}
			}
			
		});
		fr.add(t);
		fr.add(t2);
//		fr.add(btn);
		
		fr.setVisible(true);
		
	}

}
