package awt.delegationEventModel;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetActionCommand {

	static Frame fr=new Frame("ActionEvent");
	static Button btn=new Button("yellow");
	static Button btn1=new Button("green");
	static Button btn2=new Button("exit");
	
	static class myListener implements ActionListener{//�ƥ��ť��

		@Override
		public void actionPerformed(ActionEvent e) {//�ƥ�B�z��
			// ��ť�ƥ� �Y�Q���N�|���o���Ӫ��󪺸��(�|�۰ʶǤJAcrionEvent���󵹳o�Ӻ�ť��)(ex:btn1 �Q�� �N�i�H����btn1�����)
                                   
			String str = e.getActionCommand();
	        if(str.equals("yellow")) {
	        	fr.setBackground(Color.yellow);
	        }
	        if(str.equals("green")) {
	        	fr.setBackground(Color.green);
	        }
	        if(str.equals("exit")) {
	        	System.exit(0); //�N���`����
	        }
		}
		
	}
	public static void main(String[] args) {

		fr.setLayout(new FlowLayout());//�y�ʦ������t�m
		fr.setSize(200,120);
		
		btn.addActionListener(new myListener());//���U
		btn1.addActionListener(new myListener());
		btn2.addActionListener(new myListener());
		
		fr.add(btn);
		fr.add(btn1);
		fr.add(btn2);
		
		fr.setVisible(true);
		
	}

}
