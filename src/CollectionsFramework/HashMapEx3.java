package CollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class HashMapEx3 {
	static HashMap phoneBook = new HashMap();	//static �����ڷ� Ŭ������ �޸𸮿� ����ɶ� ���� �ѹ� �����. �� ���� HashMap��ü�� ����� �ּҷ����� ���
	
	public static void main(String[] args) {
		addPhoneNo("ģ��", "���ڹ�", "010-111-1111");
		addPhoneNo("ģ��", "���ڹ�", "010-222-2222");
		addPhoneNo("ģ��", "���ڹ�", "010-333-3333");
		addPhoneNo("ȸ��", "��븮", "010-444-4444");
		addPhoneNo("ȸ��", "��븮", "010-555-5555");
		addPhoneNo("ȸ��", "�ڴ븮", "010-666-6666");
		addPhoneNo("ȸ��", "�̰���", "010-777-7777");
		addPhoneNo("��Ź", "010-888-8888");

		printList();
	}
	
	static void addGroup(String groupName) {	//�׷��� �߰��ϱ� ���� �޼���
		if(!phoneBook.containsKey(groupName))	//�������� phoneBook�� ����Ű�� HashMap��ü�� �Ű������� ���� groupName�� Key������ ������ ���� �ʴٸ�
			phoneBook.put(groupName, new HashMap());	//�ش� ��ü�� �� �Ű������� Key������ �����Ѵ�.
	}
	
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);	//������ �����ϴ� �׷��̸� �ƹ��ϵ� �Ͼ�� �ʴ´�.
		HashMap group = (HashMap)phoneBook.get(groupName);	//���ο� �������� gruop�� �Ű����� groupName�� ���?�� ��Ƽ� ��ȯ�ϰ�
		group.put(tel, name);	//�ش� ��ü��  ��ȭ��ȣ�� �̸��� �����Ѵ�.
	}
	
	static void addPhoneNo(String name, String tel) {	//�����ε� �Ͽ� ���� �̸��� �ż��带 ����Ͽ���
		addPhoneNo("��Ÿ", name, tel);
	}
	
	static void printList() {	//��¿� �޼���
		Set set = phoneBook.entrySet();	//SetŸ���� �������� set�� phoneBook�� �����͸� ��Ʈ�� �������� ��ȯ�� ��ü�� ����Ű�� �Ѵ�.
		Iterator it = set.iterator();	//Iterator�� ���Ͽ� �����͸� �о�� �غ� �Ѵ�.

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
