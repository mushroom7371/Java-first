package BaekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

//서로 다른 부분 문자열의 개수
public class N11487 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> eachOtherDifferentStringSet = new HashSet<String>();
        String targetString = br.readLine();    //주어진 문자열
        String stringForSet = "";   //서로다른 부분 문자열을 저장할 String

        for(int i = 0; i < targetString.length(); i++){ //주어진 문자열의 길이만큼 반복
            stringForSet = "";  //반복마다 부분 문자열을 담을 변수를 초기화

            for(int j = i; j < targetString.length(); j++){ //j는 i부터 반복
                stringForSet += targetString.substring(j, j+1); //j를 하나씩 늘리며 문자열을 더한다.
                eachOtherDifferentStringSet.add(stringForSet);  //중복을 허용하지 않은 set에 저장하여 중복 제거
            }
        }

        br.close();
        bw.write(eachOtherDifferentStringSet.size() + "");
        bw.flush();
        bw.close();

    }
}
