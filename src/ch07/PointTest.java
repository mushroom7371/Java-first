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
	
	

	Point (){	//Point 클래스를 상속받는 클래스에선 컴파일러가 super() 생성자를 자동으로 넣어주기 때문에 없으면 오류가 발생한다.
		
	}

	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){
		
		/*
		super(x,y);  오류!! Point3D 클래스의 생성자의 첫줄이 생성자를 호출하는 문장이 아니기에
		컴파일러가 자동적으로 super(); 를 첫줄에 넣어줌 하지만, 부모클래스인 Point에는 point();가
		정의 되어있지 않기에 오류가 발생함.
		*/
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return super.getLocation() + ", z :" + z;
		//"x :" + x + ", y :" + y의 내용은 부모클래스에 작성된 getLocation()과 동일하기 때문에 super를 통하여 작성할 수 있다.
	}
}
