package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class borderLayout {
    static Frame fr=new Frame();
	public static void main(String[] args) {
        BorderLayout bl = new BorderLayout();
		fr.setLayout(bl);
		fr.setSize(300, 200);
		
		fr.add(new Button("east"),bl.EAST);
		fr.add(new Button("west"),bl.WEST);
		fr.add(new Button("south"),bl.SOUTH);
		fr.add(new Button("north"),bl.NORTH);
		fr.add(new Button("center"),bl.CENTER);
		
		fr.setVisible(true);
	}

}
