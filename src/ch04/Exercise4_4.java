package ch04;

public class Exercise4_4 {

	public static void main(String[] args) {
	
		int num = 0;
		int count = 0;
		int i = 0;
		
		while (num < 100) {
			count++;
			i++;
			
			if(i % 2 == 0) {
				num = num + (i*-1);
			} else {
				num = num +(i);
			}
			System.out.println(num);
			}
		System.out.println("카운트 횟수 : " + count);
	}

}
