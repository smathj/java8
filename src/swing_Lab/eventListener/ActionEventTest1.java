package swing_Lab.eventListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		JButton button = (JButton) e.getSource(); // 이벤트를 발생한 이벤트 소스를 가져온다(이벤트 객체)
		String msg = button.getText();
		
		if(msg.equals("마침내 버튼이 눌러졌네용")) {
			
			button.setText("버튼을 눌러주세요");
		} else {
			button.setText("마침내 버튼이 눌러졌네용");
		}
		
		
		
		
		// 레이블은 MyFrame 클래스 안에 있어서 접근하기 어렵다
		//label.setText("마침내 버튼이 눌러졌네용");	
	}
}


class MyFrame extends JFrame {
	
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		
		JPanel p = new JPanel();
		button = new JButton("버튼을 누르세여");
		label = new JLabel("버튼을 누르면 왓다리 갓다리합니다");
		
		
		button.addActionListener(new MyListener());
		
		p.add(button);
		p.add(label);
		
		this.add(p);
		this.setVisible(true);
	}
}


public class ActionEventTest1 {
	public static void main(String[] args) {
		
		MyFrame t = new MyFrame();
	}

}
