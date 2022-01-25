package JavaStudy;

public class TypeCastingExam2 {
	public static void main(String []args) {
		int intValue; //정수형 int 타입의 변수 intValue를 선언함
		
		long longValue = 5;	//정수형 long 타입의 변수 longValue를 선언하고 여기에 5를 대입함.
		
		intValue = (int)longValue; //변수 intValue에 long타입의 변수longValue를 대입하기위해 형변환(int)를 이용
		
		System.out.println(intValue);
		
	}
}
