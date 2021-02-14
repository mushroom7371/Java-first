package ch04;

public class Ex20210208_03 {


	public static void main(String[] args) {

	       int a;
	        int sum=0;
	        for(int i=1; i<=999; i++) {
	            a = i;
	            for(int j=1; j<=i; j++) {
	                if(a%j==0) {
	                    sum = sum + j;
	                }
	            }
	            if((sum-i)==i) {
	                System.out.println(i);
	            }
	            sum=0;
	        }
	}

}
