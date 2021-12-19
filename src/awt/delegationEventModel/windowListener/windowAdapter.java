package awt.delegationEventModel.windowListener;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class windowAdapter {
	


		static Frame fr=new Frame("windowsListener");
		
		static class listener extends WindowAdapter{

			@Override
			public void windowClosing(WindowEvent e) {
              System.out.println("windowClosing!!!");
              fr.dispose();
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated!!!");
			}
			
		}
		public static void main(String[] args) {
			fr.setLayout(null);
			fr.setSize(400,400);
			fr.addWindowListener(new listener());
			fr.setVisible(true);
		}
	

}
