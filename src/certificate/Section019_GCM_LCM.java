package certificate;

import java.util.Scanner;

class Section019_GCM_LCM {
	//최대공약수, 최소공배수 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, big, small, mok, nmg, gcm, lcm;
		//a = 첫번째 입력, b = 두번째 입력, big = 큰수, small = 작은수, mok = 몫, nmg = 나머지, gcm = 최대공약수, lcm = 최소공배수
		
		System.out.print("첫번째수 입력 : ");
		a = sc.nextInt();
		System.out.print("두번째수 입력 : ");
		b = sc.nextInt();
		
		if(a >= b) {	//입력받은 수의 크기대로 변수에 저장
			big = a;
			small = b;
		}else {
			big = b;
			small = a;
		}
		
		while(true) {
			mok = big/small;	//int 타입의 변수이므로 소수점이 버려지기에 몫으로 추가 작업없이 가능
			nmg = big - small*mok;	//마찬가지 int 타입의 특징을 이용해서 나머지를 구함
			
			if(nmg == 0) {
				gcm = small;
				lcm = a * b / gcm;
				System.out.println("gcm = " + gcm + ", lcm = " + lcm);
				break;
			}
			
			big = small;
			small = nmg;
		}
		
		sc.close();
	}

}
