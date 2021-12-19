package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class girdLayout {
    static Frame fr=new Frame();
	public static void main(String[] args) {

		GridLayout g = new GridLayout(2,3,2,2);//¦æ¼Æ,¦C(ros,cols) or (rows,cols,hgap,vgap)
		fr.setLayout(g);
		fr.setSize(300,200);
		
		fr.add(new Button("1"));
		fr.add(new Button("2"));
		fr.add(new Button("3"));
		fr.add(new Button("4"));
		fr.add(new Button("5"));
		fr.add(new Button("6"));
		
		fr.setVisible(true);
		
		System.out.println(g.getColumns());
		System.out.println(g.getHgap());
		System.out.println(g.getVgap());
		System.out.println(g.getRows());
		
	}

}
