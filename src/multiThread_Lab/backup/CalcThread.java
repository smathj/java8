package multiThread_Lab.backup;

public class CalcThread extends Thread {
	
	
	public CalcThread(String name) {
		// 스레드 이름 변경
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i<2000000000; i++) { // 20억번
			System.out.println(getName());
		}
	}
}
