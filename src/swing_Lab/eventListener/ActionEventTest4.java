package swing_Lab.eventListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame4 extends JFrame {
	
	private JButton button;
	private JLabel label;
	
	
	public MyFrame4() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		
		JPanel p = new JPanel();	// 컨테이너
		
		
		button = new JButton("버튼을 누르시오");			// 버튼
		label = new JLabel("아직 버튼이 눌러지지 않았습니다");	// 라벨
		
		// 이벤트 리스너를 버튼에 종속
		// 익명 클래스 사용
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					label.setText("마침내 버튼이 눌러졌습니다");
				}
			}
		});
		
		p.add(button);
		p.add(label);
		
		this.add(p);
		this.setVisible(true);
		
	}
	
	
}


public class ActionEventTest4 {

	public static void main(String[] args) {

		MyFrame4 f = new MyFrame4();
	}

}
