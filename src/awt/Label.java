package awt;

import java.awt.*;

import javax.swing.JLabel;
public class Label {

	static Frame fr = new Frame();
	
	static JLabel label = new JLabel("KUAS",new JLabel().CENTER);//置中
	static JLabel label2=new JLabel();
static JLabel label3= new JLabel();
	public static void main(String[] args) {
		fr.setLayout(null);//取消版面配置(不取消 會自動幫你對齊)
		fr.setSize(300,200); //window 寬 高
		fr.setBackground(Color.yellow); //window background
		fr.setLocation(500,300);//window location(彈出位置)
		
		label.setForeground(Color.blue);//標籤字體的顏色
		
		label2.setText("Roy"); //設定標籤內容
		label2.setBounds(10, 100, 50, 50);//設定多個標籤位置 必須用 setBounds 不能使用new JLabel()來置中 命名
        label2.setForeground(Color.gray);
        
        label3.setText("Joel");
        label3.setForeground(Color.green);
        label3.setBounds(20, 50, 50, 50);
        
        fr.add(label2);//將 Label(標籤) 加入 window
        fr.add(label3);
		fr.setVisible(true);//顯示window
	}

}
