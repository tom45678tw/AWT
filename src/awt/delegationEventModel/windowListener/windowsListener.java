package awt.delegationEventModel.windowListener;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class windowsListener {

	static Frame fr=new Frame("windowsListener");
	
	static class listener implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {//���}����
			// TODO Auto-generated method stub
			System.out.println("WindowOpened!!!");
		}

		@Override
		public void windowClosing(WindowEvent e) {//��������(�k�W��X�Ÿ�)
			// TODO Auto-generated method stub
			System.out.println("windowClosing!!!");
			fr.dispose();
		}

		@Override
		public void windowClosed(WindowEvent e) {//���������� �{������ �~Ĳ�o
			// TODO Auto-generated method stub
			System.out.println("windowClosed!!!");
		}

		@Override
		public void windowIconified(WindowEvent e) {//�Y�p����(�k�W��-�Ÿ�)
			// TODO Auto-generated method stub
			System.out.println("windowIconified!!!");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {//�N�Y�p������_
			// TODO Auto-generated method stub
			System.out.println("windowDeiconified!!!");
		}

		@Override
		public void windowActivated(WindowEvent e) {//�J�I����
			// TODO Auto-generated method stub
			System.out.println("windowActivated!!!");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {//�ܦ��D�J�I����
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
