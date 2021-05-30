package AlgorithmStudy;

import java.lang.reflect.GenericSignatureFormatError;

public class GenericClassTester {
	
	static class GenericClass<T>{	//static Ŭ������ �����Ͽ� �޸𸮿� ���� �ɶ� ����ȴ�.
		
		private T xyz;	//private �����ڷ� ���� Ŭ���������� ��� �����ϵ��� ��
		GenericClass(T t){
			this.xyz = t;	//�����ڸ� ���� �Ű������� ���� ���� ������ �����Ѵ�.
		}
		
		T getXyz() {	//get �޼��带 ���Ͽ� �ٸ� ������ ���� ���� �� �ֵ��� ��
			return xyz;
		}
		
	}
	
	public static void main(String[] args) {
		
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());	//��ü�� �����Ҷ� ���ʸ����� ������ Ÿ�Ը� ������ �� �ֵ��� �Ͽ���, �޼��带 ���Ͽ� ���� �Ҿ�� �� �ֵ��� �Ͽ���.
		System.out.println(n.getXyz());
	}
	
	
}
