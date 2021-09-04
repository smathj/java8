package multiThread_Lab.priority;

public class ThreadNameExample {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();	// mainThread 생성!
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		
		Thread threadA = new ThreadA();				// ThreadA 생성!
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		threadA.start();							// ThreadA 실행!
		
		Thread threadB = new ThreadB();				// ThreadB 생성!
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		threadB.start();							// ThreadB 실행!
		
		
	}

}
