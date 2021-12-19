package awt.delegationEventModel;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListeners implements ActionListener {

	private  Frame fr=new Frame();
	@Override
	public  void actionPerformed(ActionEvent e) {

		fr.setBackground(Color.pink);
	}

}
