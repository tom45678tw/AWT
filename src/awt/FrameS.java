package awt;

import java.awt.Color;
import java.awt.Frame;



public class FrameS {

 static Frame frame = new Frame("第一個Frame");
	public static void main(String[] args) {

		frame.setSize(900,150); //寬,高
		frame.setBackground(Color.green);//背景顏色
		frame.setLocation(200, 300);//視窗一開始彈出的位置
		frame.setName("Tom");
		frame.setVisible(true); //顯示視窗
		
		System.out.println("視窗X軸:"+frame.getX());
		System.out.println("視窗Y軸:"+frame.getY());
		System.out.println("視窗高度:"+frame.getHeight());
		System.out.println("視窗寬度:"+frame.getWidth());
		System.out.println("視窗名稱:"+frame.getName());
		System.out.println("視窗背景顏色:"+frame.getBackground());
		System.out.println("視窗Title:"+frame.getTitle());
		
		
	}

}
