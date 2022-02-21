package programmers;

//자릿수 더하기
class DigitSum {
    private int solution(int n) {
        int answer = 0;
        String number = Integer.toString(n);	//주어진 숫자를 문자열로 변환
        
        for(int i = 0; i < number.length(); i++) {	//String 타입 참조변수 number가 가리키는 배열의 각 번지수가 숫자의 자리수가 된다.
        	answer += Character.getNumericValue(number.charAt(i));	//해당 데이터를 뽑아내어 숫자로 변환 후 더한다.
        }
        
        System.out.println("Hello Java");

        return answer;
    }
}
