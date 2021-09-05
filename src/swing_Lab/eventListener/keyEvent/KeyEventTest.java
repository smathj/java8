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

// KeyListener 인터페이스 상속
public class KeyEventTest extends JFrame implements KeyListener {

	private JPanel panel;
	private JTextField filed;
	private JTextArea area;
	
	
	public KeyEventTest() {
		
		panel = new JPanel(new GridLayout(0,2));
		panel.add(new JLabel("문자를 입력하시오"));
		
		filed = new JTextField(10);
		
		panel.add(filed);
		
		area = new JTextArea(3,30);
		
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		
		filed.addKeyListener(this);	// addKeyListener() 메서드로, 현재 객체를 이벤트 리스너로 추가한다
		setTitle("KeyEnvet Test");
		setSize(400,200);
		setVisible(true);
	}
	
	
	@Override	// 키가 입력되면 호출
	public void keyTyped(KeyEvent e) {
		
		display(e, "Key Typed		");
	}
	
	
	@Override	// 키가 누르는 순간 호출
	public void keyPressed(KeyEvent e) {
		
		display(e, "Key Pressed		");
	}
	
	@Override	// 키에서 손을 때는 순간 호출
	public void keyReleased(KeyEvent e) {
		
		display(e, "Key Released		");
	}	
	
	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		
		// getKeyCode()을 사용하여서 눌러진 키의 유니코드값을 얻는다
		int keyCode = e.getKeyCode();
		
		
		String modifiers = "Alt: " + e.isAltDown() + "Ctrl: "
				+ e.isControlDown() + "Shift: " + e.isShiftDown();
		
		area.append(" " + s + "문자" + c + "(코드: " + keyCode + ") " + modifiers + "\n");
					
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventTest();
	}
}
