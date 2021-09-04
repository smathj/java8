package swing_Lab.batchManager.randdomAbsolute;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	JPanel p = new JPanel();
	JLabel[] lables = new JLabel[30];
	
	
	public MyFrame() {
		
		p.setLayout(null);			// 배치 관리자 사용 안함
		p.setBackground(Color.yellow);
		
		for(int i = 0; i< 30; i++) {
			lables[i] = new JLabel("" + i); //숫자
			int x = (int) (500 * Math.random());
			int y = (int) (500 * Math.random());
			
			lables[i].setForeground(Color.MAGENTA);	// 글자색 
			lables[i].setLocation(x, y);			// 절대 위치 ( 난수 , 난수 )
			lables[i].setSize(20,20);				// 가로,세로
			
			p.add(lables[i]);						// 라벨을 패널에 추가
			
		}
		
		
		add(p);										// 컨테이너에 패널 추가
		setTitle("흩날려라 숫자여");					// 컨테이너 이름
		setSize(500,300);							// 컨테이너 크기
		setVisible(true);							// 컨테이너 보여줄꺼?
			
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		
	}
}




