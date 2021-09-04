package swing_Lab.jframe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	// 프레임 생성하기 #2
	
	// JFrame을 상속받고 , 생성자 셋팅
	public MyFrame() {
		
		setSize(800,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("나태쿤은 피자가 마렵다");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("나태쿤 피자궁전에 오신걸 환영합니다. 피자좀 골라보시게");
		
		panelA.add(label1);
		
		JButton button1 = new JButton("키북&하북 하프피자");
		JButton button2 = new JButton("보릐&즹가 하프피자");
		JButton button3 = new JButton("동경&대리피자 하프피자");
		
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		
		JLabel label2 = new JLabel("개수");
		
		JTextField field1 = new JTextField(10);
		
		panelB.add(label2);	// 패널B에 "개수" 추가
		panelB.add(field1);	// 패널B에 인풋박스 추가
		panelB.setBackground(Color.black);
		
		
		panel.add(panelA);	// 가장 외부 패널에 패널A 추가
		panel.add(panelB);	// 가장 외부 패널에 패널B 추가
		
		add(panel);
		
		
		
		
		
		
		
		
		
		// 현재 화면의 크기를 얻는다
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setLocation(screenSize.width/2, screenSize.height/2); // 화면 중앙에 나타나라!
		Image img = kit.getImage("동경dog.jpg");
		setIconImage(img);
		
		
//		setLayout(new FlowLayout());			// 순차적으로 컴포넌트를 배치하는 방식 사용
//		JButton button = new JButton("버튼");		// 버튼 생성
//		this.add(button);						// 버튼 추가
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MyFrame f = new MyFrame();
	}
	
}
