package swing_Lab.batchManager.flowLayOut;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	
	JPanel p1;
	
	public MyFrame() {
		
		setSize(300,200);
		setTitle("FlowLayOut Å×½ºÆ®");
		
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		for(int i = 0; i < 10; i++) 
		{
			p1.add(new JButton("Button" + i));
			
		}
//		p1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); 
		add(p1);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		MyFrame f = new MyFrame();
	}
	
	
	
	
}



