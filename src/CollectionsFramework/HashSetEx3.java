package CollectionsFramework;

import java.util.*;

public class HashSetEx3 {
	public static void main (String args []) {
		HashSet set = new HashSet();	//����Ȯ���� ���� HashSet�ν��Ͻ��� 2�� ������
		HashSet set2 = new HashSet();
		
		set.add("abc");	//HashSet�ν��Ͻ��� add()�޼��带 ���� �����͸� ����
		set.add("abc");	//�ߺ� ����
		set.add(new Person("David", 10));	//PersonŬ������ ���� ��ü�� �����ϰ� �������� �������� �ʵ尪�� �ʱ�ȭ �Ѵ�.
		set.add(new Person("David", 10));	//�ߺ� ����
		
		System.out.println(set);	// ���� "abc"�� ���� �����ͷ� �ν��Ͽ� ��������� "David", 10�� �׷��� �ʴ�.
									// ���ڿ� "abc"�� ��� �ν��Ͻ��� �ּҴ� ���� ������ ����Ű���� new�� ���� ������ �ν��Ͻ��� �ٸ� �ּҰ��� ���� ���δٸ� ������ ��ü�̴�
		System.out.println("----------------");
		
		set2.add(new Person2("David", 10));
		set2.add(new Person2("David", 10));
		System.out.println(set2); //Person2������ �ּҰ��� �ٸ� �ν��Ͻ����� ������ ������ �ν��ϰ��ϴ� �޼��尡 �ִ�
		
	}
}

class Person{
	String name;
	int age;
	
	Person(String name, int age){	//�Ű������� String, int ���� �޴´�.
		this.name = name;	//�ʵ忡�� ������ ������ �Ű������� ���� �����Ѵ�. this�� �ڱ��ڽ��� �ǹ�, �� �ʵ忡 �ִ� ������ �ǹ��Ѵ�.
		this.age = age;
	}
	
	public String toString() {	//?? �� �޼��带 ���� name�� age�� ��½� ������ �����Ѵ�.
		return name + ":" + age;
	}
}

class Person2{
	String name;
	int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {	//��ȯŸ���� ������ �޼��带 �����ϰ� �Ű������� Object Ÿ���� ���������� �޴´�.
		if(obj instanceof Person2) {	//obj�� ����Ű�� �ν��Ͻ��� Person2�� �ν��Ͻ��� �´ٸ�(Object�� ��� Ŭ������ �����̴� ��, ��� Ŭ������ Object�� ���� ���� ����Ҽ� �ִ�.)
			Person2 tmp = (Person2)obj;	//Person2 Ÿ���� �������� tmp�� �����ϰ� obj�� Person2 Ÿ������ ����ȯ �Ѵ�.(������?)
			return name.equals(tmp.name) && age == tmp.age; //boolean Ÿ���� �����ؾߵǴµ� �� �𸣰��� �Ƹ� �������� true, false�� ��Ÿ���µ�
															//if���� ������ �´� �ٸ� ������ ���ϰ��� ��ȯ�ϰ� ������
		}
		return false;	//if ������ �ƴ϶�� ����� �����ͼ� false�� ��ȯ��
	}
	
	public int hashCode() { //�ڼ����� ������ hashCode�� ���� ������ ���� ���δٸ� ��ü�� ���� ��ü�� �ν��ϰ� �ϴ� �޼��� ����. ���⼭�� �������̵�(������ �ٲٴ°�)�� ����
		return (name+age).hashCode();
	}
	
	public String toString() {
		return name + ":" + age;
	}
}
