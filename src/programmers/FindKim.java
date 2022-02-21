package programmers;

//서울에서 김서방 찾기
class FindKim {
	private String solution(String[] seoul) {
        String answer = "";
        
        for(int i = 0; i < seoul.length; i++) {	//주어진 배열의 길이만큼 반복
        	if(seoul[i].equals("Kim")) {
        		//==로 비교하는 것은 객체의 주소가 같은지 비교하는 것이므로 텍스트 내용을 비교하기 위해서는
        		//equals()메서드로 확인해야 됨. 예시로 String a = new String("123")과 String b = new String("123")은
        		//같은 123이지만, 객체가 다르다.
        		answer = "김서방은 " + i + "에 있다";
        		break;	//무조건 1명이므로 찾으면 그만둔다.
        	}
        }
        
        return answer;
    }
}
