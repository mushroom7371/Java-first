package CollectionsFramework;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

class QueueEx1 {
	static Queue q = new LinkedList();	//static로 인하여 클래스가 메모리에 적재될때 최초 한번 실행 된다. 이경우 LiskedList 객체를 생성하여 Queue 타입의 참조변수에 주소값을 저장한다.
	static final int MAX_SIZE = 5;	//Queue의 최대 사이즈를 설정한다.
	
	public static void main(String [] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {	//반복이 언제 끝날지 모르므로 while문장을 사용하며, 조건문을 true로 주어 항상 반복문의 내용이 실행되도록 하였다.
			System.out.print(">>");
			
			try {
				Scanner s = new Scanner(System.in);
				String input = s.next().trim();
				//사용자가 키보드로 입력한 값을 객체로 생성하여 String 타입의 참조변수에 그 객체의 주소값을 담는다. 이때 trim()메서드를 이용하여 공백을 지운다.
				
				if("".equals(input)) continue;
				//빈 문자열이 값으로 들어온다면 continue로 위의 반복문 시작점으로 돌아간다.
				
				if(input.equalsIgnoreCase("q")) {	//대소문자 상관없이 q가 입력된다면, 프로그램을 종료한다.
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {	//help가 입력되면 아래와 같은 메뉴를 보여준다.
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				}else if(input.equalsIgnoreCase("history")) {	//history가 입력되었을시
					int i = 0;
					
					save(input);
					//아래의 static 메서드를 통하여 input의 내용이 Queue에 저장된다.
					
					LinkedList tmp = (LinkedList)q;	//임시로 선언한 LinkedList 타입의 참조변수 tmp가 상단에 선언한 Queue타입의 참조변수를 가리키게 되나 형변환을 하여 가리킨다.
					ListIterator it = tmp.listIterator();
					//list에 저장된 요소들을 읽어오기 위해 표준 인터페이스 iterator를 사용하였다.
					
					while(it.hasNext()) {	//저장된 LinkedList에 값이 저장되어있다면 그 내용을 읽어와 출력한다.
						System.out.println(++i + "." + it.next());
					}
				}else {
					save(input);
					System.out.println(input);
					//위에서 정의한 단어들에 부합하지 않는 값이 입력된다면 그 값을 Queue에 저장한다.
				}
			}catch(Exception e) {
				System.out.println("입력 오류 입니다.");
				e.printStackTrace();
				//오류발생시 Exception 클래스의 객체를 통하여 해당 오류 내용을 출력하도록 하였다.
			}
		}
	}	//main
	
	public static void save(String input) {	//static 메서드 키보드로 입력된 값을 Queue에 저장한다.
		if(!"".equals(input))
		q.offer(input);
		
		if(q.size() > MAX_SIZE)	//Queue의 크기가 MAX_SIZE를 넘는다면 Queue의 특성상 먼저 들어간 내용이 제거된다.
			q.remove();
	}
}
