package programmers;

//2016?
public class YearOf2016 {
	private String solution(int a, int b) {
		String answer = "";
		int count = 0;	//????쇱瑜?30?쇰? 怨???湲곗 31?? ?ㅻ??29?쇱 ?? ??嫄곕 類 蹂?
		int days = 0;	//a ?ш?吏? b?쇨?吏 ?遺 ??????ν 蹂?
		
		for(int i = 1; i < a; i++) {	//1?遺??a? ?源吏 諛蹂?
			if(a == 1) {	//a濡 ?ㅼ댁?媛??1??대쇰㈃ count瑜?? ?????諛蹂듭 鍮?몃媛??
				break;
			}
			
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {	//議곌굔?쇰? 湲곗ы ?ъ ???31???대濡
				count++;	//count瑜?1 ????
			}else if( i == 2) {	//2??대쇰㈃ ?ㅻ湲곗? 29???대濡
				count--;	//count瑜?1 類??
			}
		}

		if(a == 1) {	//1??대쇰㈃ 珥 ?쇱? b媛 ???
			days = b;
		}else {	//?대???源吏? 紐⑤ ?⑹ 援ы??
			days = (a - 1)*30 + b + count;	//??ъ ?洹?쇱??30? 吏? ?щ? 怨깊 ? ?대??쇱 ???? count 濡 31?? 29?쇱 而⑦몃· ???
		}
		
		if(days % 7 == 3) {	//1? 1?쇱 湲??쇱대濡 ?대? 李멸??????쇱 援ы??
			answer = "SUN";
		}else if(days % 7 == 4) {
			answer = "MON";
		}else if(days % 7 == 5) {
			answer = "TUE";
		}else if(days % 7 == 6) {
			answer = "WED";
		}else if(days % 7 == 0) {
			answer = "THU";
		}else if(days % 7 == 1) {
			answer = "FRI";
		}else if(days % 7 == 2) {
			answer = "SAT";
		}
		
		return answer;
    }
}
