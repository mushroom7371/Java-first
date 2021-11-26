package programmers;

//전화번호 뒷자리를 제외한 번호 *로 마스킹 하기
class MakinPhoneNumber {
	private String soultion(String phone_number) {
		StringBuilder maskingNum = new StringBuilder(phone_number);
		
		for(int i = 0; i < phone_number.length()-4; i++) {	//뒷 4자리 전까지 반복 실시
			maskingNum.setCharAt(i, '*');	//setCharAt()메서드를 이용하여 해당 자리의 문자값을 *로 바꾼다.
		}
		
		return maskingNum.toString();		//toString() 메서드는 객체가 가진 정보나 값들을 문자열로 만들어 리턴한다.
	}
}
