package awt;

import java.awt.Color;
import java.awt.Frame;



public class FrameS {

 static Frame frame = new Frame("�Ĥ@��Frame");
	public static void main(String[] args) {

		frame.setSize(900,150); //�e,��
		frame.setBackground(Color.green);//�I���C��
		frame.setLocation(200, 300);//�����@�}�l�u�X����m
		frame.setName("Tom");
		frame.setVisible(true); //��ܵ���
		
		System.out.println("����X�b:"+frame.getX());
		System.out.println("����Y�b:"+frame.getY());
		System.out.println("��������:"+frame.getHeight());
		System.out.println("�����e��:"+frame.getWidth());
		System.out.println("�����W��:"+frame.getName());
		System.out.println("�����I���C��:"+frame.getBackground());
		System.out.println("����Title:"+frame.getTitle());
		
		
	}

}
