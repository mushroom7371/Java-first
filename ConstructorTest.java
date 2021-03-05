package Practice;

class Data1{
	int value;
}

class Data2{
	int value;
	
	Data2(int x){
		value = x;
	}	//이미 생성자가 정의 되어 있음 그래서 인스턴스 생성시 입력 필요
	//Data2(){} 이와 같이 추가로 생성자를 정의 해도 됨
}

public class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		// Data2 d2 = new Data2(); Data2 클래스에서 생성자가 이미 정의 되어있어서 오류가남
		Data2 d3 = new Data2(10); // 이와 같이 인스턴스 생성 시 생성자를 입력해야됨
		
		System.out.println(d1.value);
		System.out.println(d3.value);

	}

}
