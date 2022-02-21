package programmers;

//신규아이디 추천
class NewId {
	private String solution(String new_id) {
		String answer = "";
		
		//1단계 소문자로 치환
		String step1 = new_id.toLowerCase();
		
		//2단계 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
		char[] step1_arr = step1.toCharArray();	//문자을 핸들링 하기 위해 char 배열에 담는다.
        StringBuilder step2 = new StringBuilder();	//반복을 통해 거른 문자를 저장할 StringBuilder 객체 생성
        
        for (char c : step1_arr) {	//step1_arr에 담긴 문자들이 아래의 조건에 부합한다면
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                step2.append(c);	//그 문자열을 더한다.
            }
        }
        
        //3단계 ..이 연속된 경우 .으로 치환한다.
        String step3 = step2.toString().replace("..", ".");
        
        while (step3.contains("..")) {	//..이 있다면
            step3 = step3.replace("..", ".");	//.으로 치환한다 마침표가 여러개가 붙어 있더라도 while문을 통하여 결국 한개만 남게됨
        }
        
        //4단계 .이 처음이나 끝에 있다면 제거
        String step4 = step3;
        
        if (step4.length() > 0) {	//문자열이 0보다 크다면
            if (step4.charAt(0) == '.') {	//첫번째 번지에 마침표가 있으면 제거한다.
                step4 = step4.substring(1, step4.length());
            }
        }
        
        if (step4.length() > 0) {
            if (step4.charAt(step4.length() - 1) == '.') {	//끝자리에 있다면 제거한다.
                step4 = step4.substring(0, step4.length() - 1);
            }
        }
        
        //5단계 빈문자열이라면 a를 대입한다.
        String step5 = step4;
        
        if (step5.equals("")) {
            step5 = "a";
        }
        
        //6단계 16자 이상이라면, 첫 15개의 문자를 제외한 나머지를 자른다.
        String step6 = step5;
        
        if (step6.length() >= 16) {
            step6 = step6.substring(0, 15);

            if (step6.charAt(step6.length() - 1) == '.') {	//자른 끝자리가 .으로 끝나면
                step6 = step6.substring(0, step6.length() - 1);	//.을 제거한다.
            }
        }
        
        //7단계 2자리 이하라면 마지막 문자를 3자리가 될때까지 끝자리에 붙힘
        StringBuilder step7 = new StringBuilder(step6);
        
        if (step7.length() <= 2) {
            char last = step7.charAt(step7.length() - 1);

            while (step7.length() < 3) {
                step7.append(last);
            }
        }

        answer = String.valueOf(step7);

		return answer;
	}
}
