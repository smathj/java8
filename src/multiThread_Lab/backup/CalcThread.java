package multiThread_Lab.backup;

public class CalcThread extends Thread {
	
	
	public CalcThread(String name) {
		// ������ �̸� ����
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i<2000000000; i++) { // 20���
			System.out.println(getName());
		}
	}
}
