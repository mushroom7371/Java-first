import java.util.*;    // Scanner를 사용하기 위해 추가

class ScannerExDivide { 
	public static void main(String[] args) {
		inputMethod();
	}
		
		static void inputMethod(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("두자리 정수를 하나 입력해주세요.>");

		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

		outMethod(input,num);
		//System.out.print("num="+(num+1));  입력내용 정수값 확인
		}
		
		static void outMethod(String input,int num) {
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n", num);
		}
	} 

