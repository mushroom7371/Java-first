package ch06;

class FlowEx22 {
	public static void main(String[] args) { 
		int[] arr = {10,20,30,40,50};
		int sum = 0;

		forMethod1(arr);
		sum = forMethod2(arr);
	}

	static int forMethod2(int[]arr) {
		int sum = 0;
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}	
		System.out.println("sum="+sum);
		return sum;

	}

	static void forMethod1(int []arr){
		for(int i=0;i<arr.length;i++) {

			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}
}
