package awt.delegationEventModel.windowListener;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class windowsListener {

	static Frame fr=new Frame("windowsListener");
	
	static class listener implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {//打開視窗
			// TODO Auto-generated method stub
			System.out.println("WindowOpened!!!");
		}

		@Override
		public void windowClosing(WindowEvent e) {//關閉視窗(右上角X符號)
			// TODO Auto-generated method stub
			System.out.println("windowClosing!!!");
			fr.dispose();
		}

		@Override
		public void windowClosed(WindowEvent e) {//關閉視窗後 程式結束 才觸發
			// TODO Auto-generated method stub
			System.out.println("windowClosed!!!");
		}

		@Override
		public void windowIconified(WindowEvent e) {//縮小視窗(右上角-符號)
			// TODO Auto-generated method stub
			System.out.println("windowIconified!!!");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {//將縮小視窗恢復
			// TODO Auto-generated method stub
			System.out.println("windowDeiconified!!!");
		}

		@Override
		public void windowActivated(WindowEvent e) {//焦點視窗
			// TODO Auto-generated method stub
			System.out.println("windowActivated!!!");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {//變成非焦點視窗
			// TODO Auto-generated method stub
			System.out.println("windowDeactivated!!!");
		}
		
	}
	public static void main(String[] args) {
		fr.setLayout(null);
		fr.setSize(400,400);
		fr.addWindowListener(new listener());
		fr.setVisible(true);
	}
}
