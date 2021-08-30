package CollectionsFramework;

import java.util.EmptyStackException;
import java.util.Stack;

class ExpValidCheck {
	public static void main(String [] args) {
		if(args.length != 1) {
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
			//.exit(0)이후의 내용이 돌지를 않음... exit()메서드를 만나서 종료되는거 같은데 예제에는 왜 이렇게 써있는지 이해 불가
			//exit를 주석처리하면 밑에서 인덱스 바운드 오류발생... 알수가 없다.
		}
		
		Stack st = new Stack();
		String expression = args[0];	//여기서 부터 인덱스 범위오류 발생... args는 메인 메서드의 인자값으로 String 배열 타입 참조변수라 번지가 있어야 되는데..
		System.out.println("expression : " + expression);
		
		try{
			for(int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch == '(') {
					st.push(ch + "");
				}else if(ch == ')') {
					st.pop();
				}
			}
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치 합니다.");
			}else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		}catch(EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
			e.printStackTrace();
		}	//try - catch
		
	}	//main
}
