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
		
		p.setLayout(null);			// ��ġ ������ ��� ����
		p.setBackground(Color.yellow);
		
		for(int i = 0; i< 30; i++) {
			lables[i] = new JLabel("" + i); //����
			int x = (int) (500 * Math.random());
			int y = (int) (500 * Math.random());
			
			lables[i].setForeground(Color.MAGENTA);	// ���ڻ� 
			lables[i].setLocation(x, y);			// ���� ��ġ ( ���� , ���� )
			lables[i].setSize(20,20);				// ����,����
			
			p.add(lables[i]);						// ���� �гο� �߰�
			
		}
		
		
		add(p);										// �����̳ʿ� �г� �߰�
		setTitle("�𳯷��� ���ڿ�");					// �����̳� �̸�
		setSize(500,300);							// �����̳� ũ��
		setVisible(true);							// �����̳� �����ٲ�?
			
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		
	}
}




