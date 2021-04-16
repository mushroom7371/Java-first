package JavaStudy;

public class MainRunner {
	    public static void main(String[] args)	{
	        ArrayList arraylist = new ArrayList();	//ArrayList 클래스로 부터 객체를 생성하여 주소값을 참조변수에 저장한다.
	        arraylist.addLast(3);	//arraylist 인트턴스 안의 메서드 addLast()를 호출한다.
	        arraylist.addLast(5);
	        arraylist.add(1, 4);
	        arraylist.addFirst(10);

	        System.out.println("성공.");
	    }
	}
	
