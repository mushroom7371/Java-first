package CollectionsFramework;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();	//HashMap Ÿ���� �������� map�� �����ϰ� ���⿡ ���� ���� HashMap ��ü�� �ּҸ� �����Ѵ�.
		
		map.put("myId", "1234");	//HashMap�� put()�޼��带 �̿��Ͽ� key���� value���� ���� ��ü�� ����
		map.put("asdf", "1111");
		map.put("asdf", "1234");	//Map�� key���� �ߺ��� ������� �ʴ� unique���̹Ƿ� �������� ������ "asdf"�� value ����"1234"�� ���������.
		
		Scanner sc = new Scanner(System.in);	//Ű����� �Է¹��� ���� ����ϱ� ���� Scanner ��ü�� �����Ͽ� ���������� �ּҸ� ��Ҵ�
		
		while(true) {	//�ݺ��� while�� ���ǰ��� true�̹Ƿ� ������ �ݺ��Ѵ�.
			System.out.println("id�� password�� �Է��� �ּ���");
			System.out.print("id : ");
			String id = sc.nextLine().trim();	//String Ÿ���� �������� id�� �����ϰ�, Scanner ��ü�� nextLine()�޼���� ���ڿ��� �޾ƿ� ��, trim()�޼���� ������ ������ �� �� ���� �����Ѵ�.
			
			System.out.print("password : ");
			String password = sc.nextLine().trim(); //���� ��������
			System.out.println();
			
			if(!map.containsKey(id)) {	//�������� id�� ����Ű�� ���� map�� key������ ���� �����Ͱ� �ƴҰ��
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���..");
				continue;	//while ������ �ٽ� ���ư���.
			}else {
				if(!(map.get(id)).equals(password)){	//�Է� ���� id�� value ���� �Է¹��� password�� �ٸ��ٸ�
					System.out.println("id�� password�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				}else {	//���ٸ�
					System.out.println("���̵�� ��й�ȣ�� ��ġ�մϴ�.");
					break;	//while �ݺ����� �������´�.
				}
			}
			
		}

	}

}
