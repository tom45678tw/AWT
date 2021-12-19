package awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class flowLayout {

	static Frame fr=new Frame();
	public static void main(String[] args) {

		FlowLayout flow = new FlowLayout(FlowLayout.LEFT,3,33);//靠右對齊,水平間距為30 ,垂直為33
		
		fr.setLayout(flow);
		fr.setSize(250,300);
		
		fr.add(new Label("java",Label.LEFT));
		fr.add(new TextField("1",10));
		fr.add(new Button("click"));
		fr.add(new Label("Python",Label.LEFT));
		fr.add(new TextField("2",10));
		fr.add(new Button("click"));
		fr.add(new Label("C++",Label.LEFT));
		fr.add(new TextField("3",10));
		fr.add(new Button("click"));
		fr.add(new Label("Spring",Label.LEFT));
		fr.add(new TextField("",10));
		fr.add(new Button("click"));
		fr.add(new Label("Hibernate",Label.LEFT));
		fr.add(new TextField("",10));
		fr.add(new Button("click"));
		
		fr.setVisible(true);
		
	}

}
