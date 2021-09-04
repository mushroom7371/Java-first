package CollectionsFramework;

import java.util.Enumeration;
import java.util.Properties;

class PropertiesEx1 {
	public static void main(String[] args) {
		Properties prop = new Properties();	//Properties�� HashMap�� �������� Hashtable�� ��ӹ޾� ������ Ŭ����
		
		//prop�� Ű�� ��(key, value)�� �����Ѵ�.
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//prop�� ����� ��ҵ��� Enumeration�� �̿��Ͽ� ����Ѵ�.
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {	//e�� ����Ű�� ��ü�� ��Ұ� �� �ִٸ� �ݺ��� �ǽ��Ѵ�.
			String element = (String)e.nextElement();	//�ش� ��Ҹ� ����ȯ �Ͽ� String Ÿ���� �������� element�� ����Ű���� �Ѵ�.
			System.out.println(element + " = " + prop.getProperty(element));	//�ش� ������ ���
		}
		
		System.out.println();
		prop.setProperty("size", "20");	//setProperty()�޼��带 ���Ͽ� key�� value�� �����Ѵ�.
		System.out.println("size = " + prop.getProperty("size"));	//getProperty()�޼��带 ���Ͽ� �ش� vlaue�� �ҷ��´�.
		System.out.println("capacity = " + prop.getProperty("capacity", "20"));
		System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));
		
		System.out.println(prop);
		prop.list(System.out);
	}
}
