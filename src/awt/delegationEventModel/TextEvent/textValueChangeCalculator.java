package awt.delegationEventModel.TextEvent;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.math.BigDecimal;

import awt.delegationEventModel.actionEvent.GetSource;

public class textValueChangeCalculator {

	static Frame fr=new Frame("TextEvent");
	static TextField t=new TextField();
	static TextField t1=new TextField();
	static TextField t2=new TextField();
	static Button btn = new Button("+");
	static Button btn2 = new Button("-");
	static Button btn3=new Button("*");
	static Button btn4=new Button("/");
	static Button b = new Button("exit");

	static class actionEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			 if(e.getSource()==b) {
          	   System.exit(0);
          	   
             }
			   String text = t.getText();
               String text2 = t1.getText();
//               Integer x = Integer.valueOf(text);
//               Integer y = Integer.valueOf(text2);
               BigDecimal x = new BigDecimal(text);
               BigDecimal y = new BigDecimal(text2);
               BigDecimal result = null;
               if(e.getSource()==btn) {
             	  result=x.add(y);
               }
               
               if(e.getSource()==btn2) {
            	   result=x.subtract(y);
               }
               if(e.getSource()==btn3) {
            	   result=x.multiply(y);
               }
               if(e.getSource()==btn4) {
            	   result=x.divide(y);
               }
               
              
               t2.setText(result.toString());
               t.setText(result.toString());
		}
		
	}
	public static void main(String[] args) {

		fr.setLayout(null);
		fr.setSize(500,440);
		
        t.setBounds(100, 50, 320, 20);
        t1.setBounds(100, 100, 320, 20);
        t2.setBounds(100, 150, 320, 20);
        
        btn.setBounds(100, 200, 60, 60);
        btn2.setBounds(190, 200, 60, 60);
        btn3.setBounds(280, 200, 60, 60);
        btn4.setBounds(360, 200, 60, 60);
        b.setBounds(100, 310, 320, 60);
        btn.addActionListener(new actionEvent());
        btn2.addActionListener(new actionEvent());
        btn3.addActionListener(new actionEvent());
        btn4.addActionListener(new actionEvent());
        b.addActionListener(new actionEvent());
        
        t2.setBackground(Color.yellow);
		
//		t2.setEditable(false);//關閉輸入
//		t2.setBackground(Color.yellow);//標前為黃色
		
		
	
		fr.add(t);
		fr.add(t1);
		fr.add(t2);
		fr.add(btn);
		fr.add(btn2);
		fr.add(btn3);
		fr.add(btn4);
		fr.add(b);
//		fr.add(btn);
		
		fr.setVisible(true);
		
	}

}
