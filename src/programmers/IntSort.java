package programmers;

import java.util.Arrays;
import java.util.Collections;

//정수 내림차순 정렬
class IntSort {
	private long solution(long n) {
        long answer = 0;
        
        String num = String.valueOf(n);	//long 타입의 인자값을 String 타입으로 바꾸어 준다.
        String [] arr = new String [num.length()];	//num의 길이 만금의 크기를 가지는 String 타입 배열을 선언하고 참조변수 arr이 배열을 가리키도록 한다.
        
        for(int i = 0; i < arr.length; i++) {	//0번지 부터 배열의 크기만큼 1씩 증가 하면서 반복
        	arr[i] = String.valueOf(num.charAt(i));	//배열의 각 번지에 맞는 num의 데이터를 저장한다.
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        //java.util.Arrays 클래스에서 제공하는 sort() 메서드를 이용하여 정렬하되, 다시 java.util.Collections 클래스에서 제공하는 reverseOrder()메서드를 정렬을 내림차순으로 한다.
        num = "";	//long 타입의 변수에 담으면 덧셈이 되므로 String 타입을 재 사용한다.
        
        for(int i = 0; i < arr.length; i++) {
        	num += arr[i];	//문자열로 더해진다.
        }
        
        answer = Long.parseLong(num);	//다시 long 타입으로 변환 하여준다.
        
        return answer;
    }
}
