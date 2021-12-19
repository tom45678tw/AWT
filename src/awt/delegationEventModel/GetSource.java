package awt.delegationEventModel;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetSource {

	static Frame fr=new Frame("ActionEvent");
	static Button btn=new Button("����");
	static Button btn1=new Button("�ڵ�");
	static Button btn2=new Button("����");
	static int i=1;
	
	static class myListener implements ActionListener{//�ƥ��ť��

		@Override
		public void actionPerformed(ActionEvent e) {//�ƥ�B�z��
			// ��ť�ƥ� �Y�Q���N�|���o���Ӫ��󪺸��(�|�۰ʶǤJAcrionEvent���󵹳o�Ӻ�ť��)(ex:btn1 �Q�� �N�i�H����btn1�����)
                                   int mod = e.getModifiers();

			Button bt=(Button)e.getSource(); //�o�O���o�ƥ󪺪��� �� getActioncommand ���@��(�o�O���o�ƥ�W��)
			if(bt==btn) {
	           System.out.println("�A�����F,����");
	           System.out.println(i++);
	           System.out.println(mod); //���Uctrl + �ƹ��k�� �N�|��ܤF ���O�����j�wbutton�Ψ�Lcomponent �~�|Ĳ�o
	        }
	        if(bt==btn1) {
	        	 System.out.println("�A�ڵ��F,����");
	        	 System.out.println(i--);
	        }
	        if(bt==btn2) {
	        	 System.out.println("�����F,����");
	        	 System.out.println(i=0);
	        	System.exit(0); //�N���`����
	        }
	        
	        if(mod==512) {
	        	System.out.println("�A���FALT");
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
