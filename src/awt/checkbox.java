package awt;

import java.awt.*;

public class checkbox {
        
	static Frame fr=new Frame();
	static CheckboxGroup cbg = new CheckboxGroup();
	static Checkbox check=new Checkbox("java",true,cbg);
	static Checkbox check1=new Checkbox("Python",true);
	static Checkbox check2=new Checkbox("C#");
	public static void main(String[] args) {
        fr.setLayout(null);
		fr.setSize(400,400);
		fr.setLocation(350, 250);
		fr.setBackground(Color.blue);
		
		check.setBounds(50, 40, 80, 10);
		check1.setBounds(50, 80, 80, 10);
		check2.setBounds(50, 120, 80, 10);
		
		check.setCheckboxGroup(cbg);
		check1.setCheckboxGroup(cbg);
		check2.setCheckboxGroup(cbg);
		fr.add(check);
		fr.add(check1);
		fr.add(check2);
		
		fr.setVisible(true);
		
		System.out.println(check.getState());
		System.out.println(check.getLabel());
		System.out.println(check.getCheckboxGroup());
		
	}

}
