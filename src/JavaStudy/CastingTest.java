package JavaStudy;

public class CastingTest {
	public static void action(Robot r) {	//Robot 타입의 참조변수 r을 매개변수로 가진다.
		if(r instanceof DanceRobot ) {	// 매개변수로 입력받은 참조변수 r(Robot 타입이다)이 가리키는 인스턴스가 DanceRobot 인스턴스 이면
			DanceRobot dr = (DanceRobot)r;	//DanceRobot 타입의 참조변수 dr을 선언하고, Robot 타입의 인스턴스를 DanceTobot 타입으로 형변환 하여 이 주소값을 저장하겠다는 의미.
			dr.dance();	// DanceRobot의 인스턴스가 가진 dance() 메서드를 실행.
		}else if(r instanceof SingRobot) {	//상기 내용과 같음.
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}else if(r instanceof DrawRobot) {	//상기 내용과 같음.
			DrawRobot drr = (DrawRobot)r;
			drr.draw();
		}
	}
	
	public static void main(String args []) {	//	메인 시작
		Robot [] arr = {new DanceRobot(), new SingRobot(), new DrawRobot() };
		//Robot 타입의 배열을 생성하고 참조변수 arr에 생성된 배열의 주소값을 저장한다.
		//초기화 부분은 각각의 클래스로 부터 인스턴스를 생성하고, 그 주소값을 순차적으로 배열에 저장한다.
		for(int i = 0; i < arr.length; i++) {	//arr이 참조하는 배열의 길이만큼 1씩 증가하여 반복한다.
			action(arr[i]);	//action() 메서드를 호출하고 매개변수로 참조변수 arr[i]이 가리키는 인스턴스를 대입한다.
		}
	}//	메인 끝
}

class Robot {}	//Robot 클래스를 선언. 이 클래스는 단순 부모 클래스 역할을 한다.

class DanceRobot extends Robot{	//Robot 클래스를 상속받은 클래스
	void dance() {
		System.out.println("춤을 춥니다.");	//DanceRobot만 가진 기능 메서드
	}
}

class SingRobot extends Robot{	//Robot 클래스를 상속받은 클래스
	void sing() {
		System.out.println("노래를 부릅니다.");	//SingRobot만 가진 기능 메서드
	}
}

class DrawRobot extends Robot{	//Robot 클래스를 상속받은 클래스
	void draw() {
		System.out.println("그림을 그립니다.");	//DrawRobot만 가진 기능 메서드
	}
}
