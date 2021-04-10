package JavaStudy;

public class SongExam {
	public static void main(String [] args) {
		Song song = new Song();	//Song 클래스로 부터 새로 인스턴스를 생성하고 그 주소값을 참조변수 song에 저장
		
		song.songTitle = "곡명";		//인스턴스의 필드를 사용하기 위해 해당 인스턴스의 이름을 참조한다.
		song.singer = "가수명";		//인스턴스 안의 변수들을 초기화 한다.
		song.albumName = "앨범이름";
		song.trackNumber = 5;
		
	}
}
