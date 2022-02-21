package CollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class HashMapEx3 {
	static HashMap phoneBook = new HashMap();	//static 제어자로 클래스가 메모리에 적재될때 최초 한번 실행됨. 이 경우는 HashMap객체를 만들어 주소록으로 사용
	
	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-2222");
		addPhoneNo("친구", "김자바", "010-333-3333");
		addPhoneNo("회사", "김대리", "010-444-4444");
		addPhoneNo("회사", "김대리", "010-555-5555");
		addPhoneNo("회사", "박대리", "010-666-6666");
		addPhoneNo("회사", "이과장", "010-777-7777");
		addPhoneNo("세탁", "010-888-8888");

		printList();
	}
	
	static void addGroup(String groupName) {	//그룹을 추가하기 위한 메서드
		if(!phoneBook.containsKey(groupName))	//참조변수 phoneBook이 가리키는 HashMap객체가 매개변수로 받은 groupName을 Key값으로 가지고 있지 않다면
			phoneBook.put(groupName, new HashMap());	//해당 객체에 그 매개변수를 Key값으로 설정한다.
	}
	
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);	//기존에 존재하는 그룹이면 아무일도 일어나지 않는다.
		HashMap group = (HashMap)phoneBook.get(groupName);	//새로운 참조변수 gruop에 매개변수 groupName을 노드?에 담아서 반환하고
		group.put(tel, name);	//해당 객체에  전화번호와 이름을 저장한다.
	}
	
	static void addPhoneNo(String name, String tel) {	//오버로딩 하여 같은 이름의 매서드를 사용하였다
		addPhoneNo("기타", name, tel);
	}
	
	static void printList() {	//출력용 메서드
		Set set = phoneBook.entrySet();	//Set타입의 참조변수 set에 phoneBook의 데이터를 엔트리 형식으로 반환된 객체를 가리키게 한다.
		Iterator it = set.iterator();	//Iterator를 통하여 데이터를 읽어올 준비를 한다.

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();

			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();	

			System.out.println(" * "+e.getKey()+"["+subSet.size()+"]");

			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " " + telNo );
			}
			System.out.println();
		}
	}
}
