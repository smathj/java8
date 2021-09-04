package swing_Lab.batchManager.absolute;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	
	JButton b1;
	private JButton b2,b3;
	
	public MyFrame() {
		
		setTitle("절대위치배치 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		
		JPanel p = new JPanel();
		p.setLayout(null);		// 배치관리자 안쓴다, 절대위치로 배치하겠따
		
		b1 = new JButton("Button #1");
		b2 = new JButton("Button #2");
		b3 = new JButton("Button #3");
		
		b1.setBounds(20,5,95,30);		//x, y, w, h
		b2.setBounds(55,45,105,70);		//x, y, w, h
		b3.setBounds(180,15,105,90);	//x, y, w, h
		
		p.add(b1);						// 패널에 버튼 컴포넌트 추가
		p.add(b2);						// 패널에 버튼 컴포넌트 추가
		p.add(b3);						// 패널에 버튼 컴포넌트 추가
		
		add(p);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
	
		MyFrame f = new MyFrame();
		
	}
	
	
	
}
