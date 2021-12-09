package programmers;

//문자열 내 p와 y의 개수
class StringPYNum {
	boolean solution(String s) {
        boolean answer = true;
        
        //문자의 갯수를 저장할 변수 선언
        int p = 0;
        int y = 0;
        
        for(int i = 0; i < s.length(); i++) {	//s의 길이만큼 1씩 증가하면서 반복
        	if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){	//해당 번지의 문자가 p 또는 P 라면 변수 p의 값을 1증가 시킴
        		p++;
        	}
        	
        	if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {	//해당 번지의 문자가 y 또는 Y 라면 변수 y의 값을 1증가 시킴
        		y++;
        	}
        }
        
        if(p == y) {	//카운트 숫자가 일치하다면
        	answer = true;
        }else {			//아니라면
        	answer = false;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
