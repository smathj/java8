package swing.batchManager.�׸��巹�̾ƿ�;

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
		
		tFileld = new JTextField(35);	// �ִ� �Է¼� input
		
		panel = new JPanel();
		
		tFileld.setText("0.");			// 0. �� ���� ä���ְ�
		tFileld.setEnabled(false);		// ���� �Ұ���
		
		panel.setLayout(new GridLayout(0,5,3,3));
		buttons = new JButton[25];
		
		int index = 0;
		
		for(int rows = 0; rows < 5; rows++) 
		{
			for(int cols = 0; cols < 5; cols++)
			{
				buttons[index] = new JButton(labels[index]);
				if(cols >= 3) {
					buttons[index].setForeground(Color.red);	// ���� ���λ� ��
				} else {
					buttons[index].setForeground(Color.blue);	// ���� ���λ� ��
				}
				buttons[index].setBackground(Color.yellow);		// ��ư ����
				panel.add(buttons[index]);						// �гο� ��ư �߰�
				index++;										// ���� �ε��� ��ư �۾�
			}
		}
		
		add(tFileld, BorderLayout.NORTH);						// �Է�â ��� ��ġ
		add(panel, BorderLayout.CENTER);						// ��ư(����) �߾� ��ġ
		setVisible(true);
		pack();
		
	}
	
	public static void main(String[] args) {
		Calculator s = new Calculator();
	}
}
