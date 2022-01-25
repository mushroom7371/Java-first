package CollectionsFramework;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();	//HashMap 타입의 참조변수 map을 선언하고 여기에 새로 만든 HashMap 객체의 주소를 저장한다.
		
		map.put("myId", "1234");	//HashMap의 put()메서드를 이용하여 key값과 value값을 묶어 객체로 저장
		map.put("asdf", "1111");
		map.put("asdf", "1234");	//Map의 key값은 중복을 허용하지 않는 unique값이므로 마지막에 생성된 "asdf"의 value 값인"1234"가 덮어씌워진다.
		
		Scanner sc = new Scanner(System.in);	//키보드로 입력받은 값을 사용하기 위해 Scanner 객체를 생성하여 참조변수에 주소를 담았다
		
		while(true) {	//반복문 while의 조건값이 true이므로 무한히 반복한다.
			System.out.println("id와 password를 입력해 주세요");
			System.out.print("id : ");
			String id = sc.nextLine().trim();	//String 타입의 참조변수 id를 선언하고, Scanner 객체의 nextLine()메서드로 문자열을 받아온 후, trim()메서드로 공백을 제거한 후 이 값을 저장한다.
			
			System.out.print("password : ");
			String password = sc.nextLine().trim(); //위와 마찬가지
			System.out.println();
			
			if(!map.containsKey(id)) {	//참조변수 id가 가리키는 값이 map이 key값으로 가진 데이터가 아닐경우
				System.out.println("입력하신 id가 존재하지 않습니다. 다시 입력해주세요..");
				continue;	//while 문으로 다시 돌아간다.
			}else {
				if(!(map.get(id)).equals(password)){	//입력 받은 id의 value 값이 입력받은 password와 다르다면
					System.out.println("id와 password가 일치하지 않습니다. 다시 입력해주세요.");
				}else {	//같다면
					System.out.println("아이디와 비밀번호가 일치합니다.");
					break;	//while 반복문을 빠져나온다.
				}
			}
			
		}

	}

}
