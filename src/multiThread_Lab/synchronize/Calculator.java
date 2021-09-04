package multiThread_Lab.synchronize;

public class Calculator {
	
	private int memory;
	
	
	public int getMemory() {
		return memory;
	}
	
	//(1) 동기화 메소드 미적용
//	public void setMemory(int memory) {
//		this.memory = memory;
//		
//		try {
//			Thread.sleep(2000); // 2초 정지
//		} catch (InterruptedException e) {
//		
//		}
//		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
//	}
	
	//(2) 동기화 메소드 적용
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 2초 정지
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
