package swing_Lab.eventListener.keyEvent;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import sun.awt.DisplayChangedListener;

// KeyListener �������̽� ���
public class KeyEventTest extends JFrame implements KeyListener {

	private JPanel panel;
	private JTextField filed;
	private JTextArea area;
	
	
	public KeyEventTest() {
		
		panel = new JPanel(new GridLayout(0,2));
		panel.add(new JLabel("���ڸ� �Է��Ͻÿ�"));
		
		filed = new JTextField(10);
		
		panel.add(filed);
		
		area = new JTextArea(3,30);
		
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		
		filed.addKeyListener(this);	// addKeyListener() �޼����, ���� ��ü�� �̺�Ʈ �����ʷ� �߰��Ѵ�
		setTitle("KeyEnvet Test");
		setSize(400,200);
		setVisible(true);
	}
	
	
	@Override	// Ű�� �ԷµǸ� ȣ��
	public void keyTyped(KeyEvent e) {
		
		display(e, "Key Typed		");
	}
	
	
	@Override	// Ű�� ������ ���� ȣ��
	public void keyPressed(KeyEvent e) {
		
		display(e, "Key Pressed		");
	}
	
	@Override	// Ű���� ���� ���� ���� ȣ��
	public void keyReleased(KeyEvent e) {
		
		display(e, "Key Released		");
	}	
	
	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		
		// getKeyCode()�� ����Ͽ��� ������ Ű�� �����ڵ尪�� ��´�
		int keyCode = e.getKeyCode();
		
		
		String modifiers = "Alt: " + e.isAltDown() + "Ctrl: "
				+ e.isControlDown() + "Shift: " + e.isShiftDown();
		
		area.append(" " + s + "����" + c + "(�ڵ�: " + keyCode + ") " + modifiers + "\n");
					
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventTest();
	}
}
