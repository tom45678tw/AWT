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
	
	static class myListener implements ActionListener{//事件監聽者

		@Override
		public void actionPerformed(ActionEvent e) {//事件處理者
			// 監聽事件 若被按就會取得那個物件的資料(會自動傳入AcrionEvent物件給這個監聽器)(ex:btn1 被按 就可以取的btn1的資料)
                                   
			String str = e.getActionCommand();
	        if(str.equals("yellow")) {
	        	fr.setBackground(Color.yellow);
	        }
	        if(str.equals("green")) {
	        	fr.setBackground(Color.green);
	        }
	        if(str.equals("exit")) {
	        	System.exit(0); //代表正常結束
	        }
		}
		
	}
	public static void main(String[] args) {

		fr.setLayout(new FlowLayout());//流動式版面配置
		fr.setSize(200,120);
		
		btn.addActionListener(new myListener());//註冊
		btn1.addActionListener(new myListener());
		btn2.addActionListener(new myListener());
		
		fr.add(btn);
		fr.add(btn1);
		fr.add(btn2);
		
		fr.setVisible(true);
		
	}

}
