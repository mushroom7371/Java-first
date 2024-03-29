package programmers;

import java.util.HashSet;
import java.util.Set;

//??李얘린(????)
class FindPrimeNum {
	boolean [] visit;	//?대??ъ⑺ ?レ瑜??ㅼ ?ъ⑺吏 紐삵?濡 ??⑦湲??? 諛곗?
	char [] arr;
	Set<Integer> set = new HashSet<Integer>();
	
	public boolean isPrime(int n) {	//???몄? ??⑦湲??? 硫??
		if(n == 1 || n == 0) {	//留ㅺ?蹂?濡 ?ㅼ댁??レ媛 0 ?? 1?대㈃ ??媛 ????
			return false;
		}
		
		for(int i = 2; i < n; i++) {	//二쇱댁? ?レ源吏 2遺??1??利媛硫댁 諛蹂?
			if(n % i == 0) {	//二쇱댁? ?レ瑜?i濡 ??댁? ?癒몄?媛 0?대쇰㈃ ??媛 ????
				return false;
			}
		}
		
		return true;	//洹??댁몄 寃쎌곕 1怨??湲???留?쇰? ???⑥댁?? ??대濡 ???대?
	}
	
	public int charsToInt(char [] arr, int length) {	//臾몄瑜?int ???쇰? 蹂??湲??? 硫??
		StringBuilder sb = new StringBuilder();	//?レ瑜?梨? ?ｌ 寃?대濡 ???諛 ???
		
		for(int i = 0; i < length; i++) {	//arr??媛由ыㅻ 諛곗댁 ?곗댄곕? sb? ???濡 異媛??ъ???
			sb.append(arr[i]);
		}
		
		return Integer.parseInt(sb.toString());	//臾몄?댁?sb瑜??レ濡 蹂????諛????
	}
	
	public void dfs(int level, int length, String numbers) {	//??? ?? 硫??
		if(level == length) {
			int num = charsToInt(arr, length);
			if(isPrime(num)) {	//???쇰㈃
				set.add(num);	//set? ?대??レ瑜???ν??
			}
		}else {
			for(int i = 0; i < numbers.length(); i++) {	//String 臾몄?댁 湲몄대???1??利媛硫댁 諛蹂?
				if(!visit[i]) {	//?대?踰吏?媛 李몄????쇰㈃, 利 ?대??ъ⑺吏 ?? ?レ?쇰㈃
					visit[i] = true;	//?ъ⑺ ?レ濡 諛轅以??
					arr[level] = numbers.charAt(i);	//arr? level 踰吏? numbers? i踰吏? 臾몄瑜???ν??
					dfs(level + 1, length, numbers);	//level? 1利媛 ???? ?ㅼ dfs瑜??몄????
					visit[i] = false;	//?ъ⑺吏 ?? ?レ濡 諛轅以??
				}
			}
		}
	}
	
	public int solution(String numbers) {
		visit = new boolean[numbers.length()];
		arr = new char[numbers.length()];
		
		for(int i = 1; i <= numbers.length(); i++) {
			dfs(0, i, numbers);
		}
		
		return set.size();
    }
}
