package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class Fonts {
         static Frame fr=new Frame();
         static TextField text= new TextField();
         static TextField text2= new TextField("text");
         static TextArea textA=new TextArea("tom",2,20,TextArea.SCROLLBARS_NONE);
         static Button b=new Button();                  
	public static void main(String[] args) {
		    fr.setLayout(null);  //這很重要!!!!!　　　取消Frame 版面配置 不然會無法控制裡面物件 button or label
            fr.setTitle("AWT");
            fr.setSize(300,300);
            fr.setLocation(200,300);
            fr.setBackground(Color.pink);
            
            text.setBounds(30, 40, 80, 20);
            text.setEchoChar('*');
            text2.setBounds(30,70,80,20);
            b.setBackground(Color.blue); //btn 背景顏色
            b.setForeground(Color.red);  //btn 字體顏色
            b.setLabel("Click");  //btn 的名稱
            b.setBounds(120, 40, 50,20);    //位置(x,y) 大小(x,y)
            
            textA.setBounds(30, 100, 140, 80);
            
            fr.add(textA);
            fr.add(text);
            fr.add(text2);
            fr.add(b);
            fr.setVisible(true);
            
            System.out.println(textA.getColumns());
            System.out.println(textA.getScrollbarVisibility());
            System.out.println(textA.getColumns());
            
	 
   
	
	
	}

}
