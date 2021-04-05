package Practice;

class CarCupy{
	String color;
	String geartype;
	int door;

	CarCupy(){
		this("white", "auto", 4);
	}

	CarCupy(String color, String geartype, int door){
		this.color = "white";
		this.geartype = "auto";
		this.door = 4;
	}

	CarCupy(CarCupy c){	//인스턴스 복사를 위한 생성자
		color = c.color;
		geartype = c.geartype;
		door = c.door;
	}
}

class ThisCarCupy {

	public static void main(String[] args) {
		CarCupy c1 = new CarCupy();
		CarCupy c2 = new CarCupy(c1);	// c1의 복사본을 만듦

		System.out.println("c1의 color = " + c1.color 
				+ ", geartype = " + c1.geartype + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color 
				+ ", geartype = " + c2.geartype + ", door = " + c2.door);
		c1.color = "blue";

		System.out.println("c1.color = blue 수행 후");
		System.out.println("c1의 color = " + c1.color 
				+ ", geartype = " + c1.geartype + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color 
				+ ", geartype = " + c2.geartype + ", door = " + c2.door);


	}

}
