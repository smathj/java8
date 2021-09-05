package swing_Lab.eventListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame5 extends JFrame {
	
	private JButton button;
	private JLabel label;
	
	
	public MyFrame5() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		
		JPanel p = new JPanel();	// 컨테이너
		
		
		button = new JButton("버튼을 누르시오");			// 버튼
		label = new JLabel("아직 버튼이 눌러지지 않았습니다");	// 라벨
		
		// 이벤트 리스너를 버튼에 종속
		// 람다식 사용
		button.addActionListener(e -> {
			label.setText("마침내 버튼이 눌러졌습니다");
		});
		
		p.add(button);
		p.add(label);
		
		this.add(p);
		this.setVisible(true);
		
	}
	
	
}












public class ActionEventTest5 {

	public static void main(String[] args) {
		
		MyFrame5 f = new MyFrame5();
	}

}
