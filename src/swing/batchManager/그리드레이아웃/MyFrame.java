package swing.batchManager.그리드레이아웃;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	
	public MyFrame() {
		
		setTitle("GridLayout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,3));	// 그리드 배치 관리자
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		
		pack();				// JFrame의 내용을 윈도우크기에 알맞게 조절 , 이거없으면 안나옴
		setVisible(true);	// 마지막으로 view를 보여줄것인지 
		
		
	}
	
	
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	
	
	
	
	
}

	
