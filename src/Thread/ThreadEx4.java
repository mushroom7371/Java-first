package Thread;

public class ThreadEx4 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		//싱글쓰레드 실행 시간을 측정하기위해 생성한 메서드를 변수에 담았다
		
		for(int i = 0; i < 300; i++)
			System.out.printf("%s", new String("-"));
		//for 반복문을 이용하여 "-"를 출력하도록 하면서 시간 지연을 위해 new String()으로 반복시 마다 새로 객체가 생성되도록 조절함
		
		System.out.print("소요시간 : " + (System.currentTimeMillis() - startTime));
		//출력메서드 내부에서 휘발성 시간측정 메서드 - startTime 을 통하여 시간의 경과를 확인함
		
		for(int i = 0; i< 300; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.print("소요시간2 : " + (System.currentTimeMillis() - startTime));
		//메인 메서드가 끝마칠때 까지의 총 소요시간을 확인
	}

}
