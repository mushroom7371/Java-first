package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//소트인사이드
public class N1427 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String strNum = br.readLine();  //입력으로 주어진 숫자
        br.close();
        List<Integer> listNum = new ArrayList<>();  //문자열로 주어진 숫자를 저장할 ArrayList

        for(int i = 0; i < strNum.length(); i++){   //문자열의 길이만큼 1씩 증가하면서 반복
            listNum.add(Integer.valueOf(Character.getNumericValue(strNum.charAt(i))));
            //String의 각 자리는 Char타입이므로 int로 변환하는 작업을 거처 하나씩 저장
        }

        Collections.sort(listNum, Collections.reverseOrder());
        //Collections 클래스에서 제공하는 정렬메서드, 리버스오더를 통해 내림차순으로 정렬

        for(int i = 0; i < listNum.size(); i++){    //하나씩 버퍼에 기록
            bw.write(listNum.get(i) + "");
        }

        bw.flush();
        bw.close();

    }
}
