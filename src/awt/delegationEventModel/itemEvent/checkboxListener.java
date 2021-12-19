package awt.delegationEventModel.itemEvent;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class checkboxListener {

	static Frame fr=new Frame("itemEvent");
	static Label l=new Label("選擇你喜歡得程式語言");
	static Label l2=new Label("你最愛的是:      ");
	static Checkbox c1=new Checkbox("java");
	static Checkbox c2=new Checkbox("python");
	static Button btn =new Button("exit");
	static class myListener implements ItemListener{
	
		
		@Override
		public void itemStateChanged(ItemEvent e) {

			Checkbox checkbox = (Checkbox)e.getSource();
			int s = e.getStateChange();
			//方法一
			if(s==e.DESELECTED) {
				System.out.println("取消: "+checkbox.getLabel());
			}
			if(s==e.SELECTED) {
				System.out.println("選取: "+checkbox.getLabel());
			}
			//方法二
			if(checkbox==c1) {
				l2.setText("你最愛的是: "+c1.getLabel());
			}
			if(checkbox==c2) {
				l2.setText("你最愛的是: "+c2.getLabel());
			}
		}
	}
	
	public static void main(String[] args) {

		fr.setLayout(new FlowLayout(FlowLayout.CENTER));
		fr.setSize(200,130);
		CheckboxGroup cbj = new CheckboxGroup();
	
		c1.setCheckboxGroup(cbj);
		c2.setCheckboxGroup(cbj);
		
		c1.addItemListener(new myListener());
		c2.addItemListener(new myListener());

		l2.setBackground(Color.yellow);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				Button source = (Button)e.getSource();
				if(source==btn) {
					System.out.println("結束");
					System.exit(0);
				}
			}
		});
		fr.add(l);
		fr.add(c1);
		fr.add(c2);
		fr.add(l2);
		fr.add(btn);
		fr.setVisible(true);
	}

	

}
