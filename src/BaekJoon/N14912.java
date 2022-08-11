package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//숫자 빈도수
public class N14912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCase = Integer.parseInt(st.nextToken());
        int targetNumber = Integer.parseInt(st.nextToken());
        int [] countArray = new int[10];    //특정 숫자의 빈도를 저장할 배열

        br.close();

        for(int i = 1; i <= testCase; i++){ //1부터 testCase 까지의 숫자만큼 반복
            String numberString = String.valueOf(i);    //int로 주어진 숫자를 String타입으로 변환

            for(int j = 0; j < numberString.length(); j++){ //String으로 된 숫자의 자리만큼 반복
                int number = numberString.charAt(j) - '0';  //해당 자리의 숫자를 다시 int로 변환
                countArray[number]++;   //배열의 해당 번지수의 카운트를 증가
            }

        }

        bw.write(countArray[targetNumber] + "");    //특정 숫자의 빈도를 버퍼에 기록
        bw.flush();
        bw.close();

    }
}
