package awt;

import java.awt.*;

import javax.swing.JLabel;
public class Label {

	static Frame fr = new Frame();
	
	static JLabel label = new JLabel("KUAS",new JLabel().CENTER);//�m��
	static JLabel label2=new JLabel();
static JLabel label3= new JLabel();
	public static void main(String[] args) {
		fr.setLayout(null);//���������t�m(������ �|�۰����A���)
		fr.setSize(300,200); //window �e ��
		fr.setBackground(Color.yellow); //window background
		fr.setLocation(500,300);//window location(�u�X��m)
		
		label.setForeground(Color.blue);//���Ҧr�骺�C��
		
		label2.setText("Roy"); //�]�w���Ҥ��e
		label2.setBounds(10, 100, 50, 50);//�]�w�h�Ӽ��Ҧ�m ������ setBounds ����ϥ�new JLabel()�Ӹm�� �R�W
        label2.setForeground(Color.gray);
        
        label3.setText("Joel");
        label3.setForeground(Color.green);
        label3.setBounds(20, 50, 50, 50);
        
        fr.add(label2);//�N Label(����) �[�J window
        fr.add(label3);
		fr.setVisible(true);//���window
	}

}
