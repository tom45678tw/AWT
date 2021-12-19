package awt.delegationEventModel;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetSource {

	static Frame fr=new Frame("ActionEvent");
	static Button btn=new Button("接受");
	static Button btn1=new Button("拒絕");
	static Button btn2=new Button("結束");
	static int i=1;
	
	static class myListener implements ActionListener{//事件監聽者

		@Override
		public void actionPerformed(ActionEvent e) {//事件處理者
			// 監聽事件 若被按就會取得那個物件的資料(會自動傳入AcrionEvent物件給這個監聽器)(ex:btn1 被按 就可以取的btn1的資料)
                                   int mod = e.getModifiers();

			Button bt=(Button)e.getSource(); //這是取得事件的物件 跟 getActioncommand 不一樣(這是取得事件名稱)
			if(bt==btn) {
	           System.out.println("你接受了,謝謝");
	           System.out.println(i++);
	           System.out.println(mod); //按下ctrl + 滑鼠右鍵 就會顯示了 但是必須綁定button或其他component 才會觸發
	        }
	        if(bt==btn1) {
	        	 System.out.println("你拒絕了,謝謝");
	        	 System.out.println(i--);
	        }
	        if(bt==btn2) {
	        	 System.out.println("結束了,謝謝");
	        	 System.out.println(i=0);
	        	System.exit(0); //代表正常結束
	        }
	        
	        if(mod==512) {
	        	System.out.println("你按了ALT");
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
