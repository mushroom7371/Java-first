package ch07;

public class PointTest {
	public static void main(String [] args) {
		Point3D p3 = new Point3D(1,2,3);
		
		System.out.println(p3.getLocation());
	}
}
class Point{
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	/*
	Point (){
		
	}
	*/
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){
		
		/*
		super(x,y);  ����!! Point3D Ŭ������ �������� ù���� �����ڸ� ȣ���ϴ� ������ �ƴϱ⿡
		�����Ϸ��� �ڵ������� super(); �� ù�ٿ� �־��� ������, �θ�Ŭ������ Point���� point();��
		���� �Ǿ����� �ʱ⿡ ������ �߻���.
		*/
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}
