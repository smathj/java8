package multiThread.status;

public class StatePrintThread extends Thread {

	private Thread targetThrad;
	
	
	// 생성자
	public StatePrintThread(Thread targetThread) {
		this.targetThrad = targetThread;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			Thread.State state = targetThrad.getState();	// 스레드 상태 얻기
			System.out.println("타겟 스레드 상태는 : " + state);
			
			// 스레드 객체가 생성되었다면
			if(state == Thread.State.NEW) {
				
				// 실행 대기 상태로 만든다
				targetThrad.start();	// for문 돌린다
			}
			
			// 스레드 실행을 마쳣다면
			if(state == Thread.State.TERMINATED) {
				
				// while문 종료
				break;
			}
			
			try {
				// 0.5초간 일시 정지
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
