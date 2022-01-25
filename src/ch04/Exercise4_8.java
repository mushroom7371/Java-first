package ch04;

public class Exercise4_8 {

	public static void main(String[] args) {
	for(int i = 0; i <=10; i++) {
		for(int j = 0; j<=10; j++) {
			
			if(((2*i) + (4*j)) == 10) {
				System.out.print("x : " + i + "\t" );
				System.out.println("y : " + j);
			}
		}
	}

	}

}
