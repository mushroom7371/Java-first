package Practice;

class ThisCar{
	String color;
	String geartype;
	int door;
	
	ThisCar(){
		this("white", "auto", 4);	//Car(String color, String geartype, int door)�� ȣ��
	}
	
	ThisCar(String color){
		this(color, "auto", 4); //	String color �� this(color...)�� color�� ��������
	}
	
	ThisCar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
}

class ThisCartest1 {

	public static void main(String[] args) {
		ThisCar c1 = new ThisCar();
		ThisCar c2 = new ThisCar("blue"); // Car(String color)�� �ǹ�
		
		System.out.println("c1�� color = " + c1.color 
							+ ", geartype = " + c1.geartype + ", door = " + c1.door);
		System.out.println("c2�� color = " + c2.color 
				+ ", geartype = " + c2.geartype + ", door = " + c2.door);
	}

}
