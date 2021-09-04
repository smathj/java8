package swing.batchManager.그리드레이아웃;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculator extends JFrame {
	
	private JPanel panel;
	private	JTextField tFileld;
	private JButton[] buttons;
	private String[] labels = {
								"Backspace","","","CE","C",
								"7","8","9","/","sqrt",
								"4","5","6","x","%",
								"1","2","3","-","1/x",
								"0","+/-",".","+","=",
							  };
	
	public Calculator() {
		
		tFileld = new JTextField(35);	// 최대 입력수 input
		
		panel = new JPanel();
		
		tFileld.setText("0.");			// 0. 을 값을 채워넣고
		tFileld.setEnabled(false);		// 수정 불가능
		
		panel.setLayout(new GridLayout(0,5,3,3));
		buttons = new JButton[25];
		
		int index = 0;
		
		for(int rows = 0; rows < 5; rows++) 
		{
			for(int cols = 0; cols < 5; cols++)
			{
				buttons[index] = new JButton(labels[index]);
				if(cols >= 3) {
					buttons[index].setForeground(Color.red);	// 좌측 내부색 색
				} else {
					buttons[index].setForeground(Color.blue);	// 우측 내부색 색
				}
				buttons[index].setBackground(Color.yellow);		// 버튼 배경색
				panel.add(buttons[index]);						// 패널에 버튼 추가
				index++;										// 다음 인덱스 버튼 작업
			}
		}
		
		add(tFileld, BorderLayout.NORTH);						// 입력창 상단 배치
		add(panel, BorderLayout.CENTER);						// 버튼(자판) 중앙 배치
		setVisible(true);
		pack();
		
	}
	
	public static void main(String[] args) {
		Calculator s = new Calculator();
	}
}
