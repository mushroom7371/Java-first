package ch09;

final class Card2{
	String kind;
	int num;
	
	Card2(){
		this("SPADE", 1);
	}
	
	Card2(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind + " : " + num;
	}
}

class ClassEx1 {
	public static void main(String[] args) {
		Card2 c = new Card2("HEART", 1);
		Card2 c2 = null;
	
		try{	//Class ��ü�� �̿��ؼ� ��ü�� �����ϴµ� newInstace()�޼���� ���� �� �Ⱦ��δٰ� ��
				//���� try�������� ���� ������ ����� �Ұ����Ͽ� ����ȿ� ���Խ�Ŵ
			Card2 c3 = Card2.class.newInstance();
			c2 = c3;	
		}catch(Exception ex) {
			ex.printStackTrace();
		}	
		
		Class cObj = c.getClass();
		//������ ��ü�� ���� Ŭ������ ������ ������� ������
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
		
	}
}
