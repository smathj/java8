package multiThread_Lab.synchronize;

public class Calculator {
	
	private int memory;
	
	
	public int getMemory() {
		return memory;
	}
	
	//(1) ����ȭ �޼ҵ� ������
//	public void setMemory(int memory) {
//		this.memory = memory;
//		
//		try {
//			Thread.sleep(2000); // 2�� ����
//		} catch (InterruptedException e) {
//		
//		}
//		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
//	}
	
	//(2) ����ȭ �޼ҵ� ����
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 2�� ����
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
