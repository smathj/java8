package multiThread_Lab.priority;

public class ThreadNameExample {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();	// mainThread ����!
		System.out.println("���α׷� ���� ������ �̸� : " + mainThread.getName());
		
		
		Thread threadA = new ThreadA();				// ThreadA ����!
		System.out.println("�۾� ������ �̸� : " + threadA.getName());
		threadA.start();							// ThreadA ����!
		
		Thread threadB = new ThreadB();				// ThreadB ����!
		System.out.println("�۾� ������ �̸� : " + threadB.getName());
		threadB.start();							// ThreadB ����!
		
		
	}

}
