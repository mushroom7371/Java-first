package ch09;

import java.util.Arrays;

class CloneEx2 {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		int [] arrClone = arr.clone();
		//배열도 객체이므로 Object 클래스를 상속받고, Cloneable 인터페이스와 Serializable인터페이스가 구현되어 있다.
		//또한 clone() 메서드의 protected 또한 public으로 오버라이딩 되어있으며 원본과 같은 반환타입을 반환하여 형변환이 필요없다.
		arrClone[0] = 6;
		int [] arrClone2 = new int[arr.length];
		System.arraycopy(arr, 0, arrClone2, 0, arr.length);
		//arraycoyp() 메서드를 통해서 배열 복사를 할수도 있다. clone()메서드를 사용한 것과 똑같다.
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		System.out.println(Arrays.toString(arrClone2));
	}
}
