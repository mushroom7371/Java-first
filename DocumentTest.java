package Practice;

class Document {
	static int count = 0;	// int Ÿ���� Ŭ���� ������ �����ϰ� 0���� �ʱ�ȭ
	String name;	//	String Ÿ���� �ν��Ͻ� ������ ���� �ʱ�ȭ null
	
	Document(){
		this("�������" + ++count);	// �ν��Ͻ� ������ Ŭ���������� ī��Ʈ �Ǿ� �����
	}
	
	Document(String name){
		this.name = name;
		System.out.println("�� ������ ������ " + this.name + "�Դϴ�.");	//���� �Է½� �״�� ���
	}
}

class DocumentTest{
	public static void main(String [] args) {
		Document d1 = new Document();	// 0���� ���� �����ڷ� ���Ͽ� 1�� ī��Ʈ�Ǿ� ���
		Document d2 = new Document("name");
		Document d3 = new Document();	// 1���� 2��
		Document d4 = new Document();	// 2���� 3����
	}
}
