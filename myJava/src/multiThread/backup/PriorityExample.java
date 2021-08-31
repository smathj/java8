package multiThread.backup;

public class PriorityExample {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			
			// 1. 스레드 10개 생성
			// 2. 1~9번 스레드 최하위 우선순위
			// 3. 10번 스레드 최우선 우선순위
			// 4. 20억번 자기 스레드 이름을 외쳐!
			
			Thread thread = new CalcThread("thread" + i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); // 하타취
			} else {
				thread.setPriority(Thread.MAX_PRIORITY); // 상타취
			}
			
			thread.start();
			
		}

	}

}
