package swing_Lab.jframe;

import javax.swing.JFrame;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 프레임 생성하기 #1
		JFrame f = new JFrame("Frame Test");
		
		f.setSize(300,200);									// 프레임 크기 설정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// "창닫기"버튼
		f.setVisible(true);									// 보일지 말지 여부 설정
		
		
	}

}
