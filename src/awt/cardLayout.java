package awt;



import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;

public class cardLayout {

	static Frame fr=new Frame();
	public static void main(String[] args) {
// 建立frame -> 設定Layout ->將元件加入Frame ->在利用 CardLayout 選擇要顯示哪一個Frame 
		CardLayout card = new CardLayout(50,30);

		fr.setLayout(card);
		fr.setSize(200,300);
		
		fr.add(new Button("1"),"b1");
		fr.add(new Button("2"),"b2");
		fr.add(new Button("3"),"b3");
		card.show(fr, "b3");
//		card.next(fr)
		
  
		fr.setVisible(true);
	
	
	
	}

}
