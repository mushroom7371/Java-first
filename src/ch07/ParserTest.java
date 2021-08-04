package ch07;

interface Parseable{
	//�������̽� �ۼ�,,, ��������� public static final ����θ�, �޼���� public abstract �� �����ؾߵ�
	//������ �����Ͻ� �����Ϸ��� �ڵ����� ��������
	public abstract void parse(String fileName);
	//void parse(...); �� ���� ���� ����
}

class ParserManager{
	public static Parseable getParser(String type) {
		//return Ÿ���� �������̽� ��� ���� return ������ �������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ�Ѵٴ� ���� �ǹ�
		//���������ڸ� public���� �����Ͽ����Ƿ� ���Ѿ��� ��𼭵� ��밡���ϸ� static �޼���� �ν��Ͻ� �������� ��밡���ϴ�.
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p;
		}
		//���ڿ��� �޾ƿ� ���� ���ǹ����� �Ǵ��Ͽ� � �ν��Ͻ��� ��ȯ���� ������
	}
}

class XMLParser implements Parseable{
	//���� �������̽��� ������ Ŭ������ �̱��� �޼��带 �ϼ��ؾߵȴ�.
	//���� �ش� �޼���� �Ϻ� �������� �ϼ����� ���Ѵٸ� class�� abstrac�� ���� �߻�Ŭ������ �����ߵȴ�.
	public void parse(String fileName) {
		System.out.println(fileName + " - XML parsing completed.");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing completed.");
	}
}

class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		//Parseable Ÿ���� �������� parser�� getParser() �޼���� ���� return���� ����Ǵµ�
		//�� ���ϰ��� Parseable �������̽��� ������ Ŭ������ �ν��Ͻ��� ����Ű�� �ּҰ��̴�.
		//parser�� Parseable �������̽� Ÿ�������� �������̽� ���� ���� ������ Ŭ������ �����̶� �� �� �ֱ⿡ ����Ÿ���� ����������
		//�̸� ������ �ڼ� �ν��Ͻ��� ������ �� �ִ�.
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
