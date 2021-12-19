package awt.delegationEventModel;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class enent_button {
    static Frame fr=new Frame("ActionListener");
    static Button btn=new Button("«ö§Ú");
           
    static class MyListener implements ActionListener {
        @Override
        public  void actionPerformed(ActionEvent e) {
        			fr.setBackground(Color.gray);
        			fr.setSize(400,300);
        }
    }
           
	public static void main(String[] args) {
          fr.setLayout(new FlowLayout());
          fr.setSize(200,120);
          fr.setBackground(Color.yellow);
          
          btn.addActionListener(new MyListener());
          
          fr.add(btn);
          fr.setVisible(true);
		
	}

}


