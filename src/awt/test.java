package awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public abstract class test {

	static Frame fr=new Frame();
	public static void main(String[] args) {
//1
//		fr.setTitle("Tom");
//		fr.setSize(600,300);
//		fr.setBackground(Color.pink);
//		
//		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		fr.setVisible(true);
		CheckboxGroup cbg = new CheckboxGroup();
		GridLayout g = new GridLayout(10,2);
		fr.setSize(300,300);
		fr.setLayout(g);
		fr.add(new Label("請選擇你要的"));
		fr.add(new Checkbox("碩士",true,cbg));
		fr.add(new Checkbox("學士",true,cbg));
		fr.add(new Checkbox("高中",true,cbg));
		fr.add(new Checkbox("國中",true,cbg));
		Button b1 = new Button("確認");
		b1.setSize(30,30);
		fr.add(b1,5);
		fr.add(new Button("取消"));
		fr.setVisible(true);
	}

}
