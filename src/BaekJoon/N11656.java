package BaekJoon;

import java.io.*;
import java.util.Arrays;

//접미사 배열
public class N11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder inputString = new StringBuilder(br.readLine());   //주어진 문자열 첫번째 인덱스를 제거하기 위해 StringBuilder를 사용
        String [] inputStringArrays = new String[inputString.length()]; //문자열의 길이 만큼의 크기를 가지는 접미사 배열을 만든다.

        for(int i = 0; i < inputStringArrays.length; i++){
            inputStringArrays[i] = inputString.toString();  //접미사 배열에 문자열을 저장
            inputString.deleteCharAt(0);    //문자열에서 첫번째 인덱스를 제거
        }

        br.close();
        Arrays.sort(inputStringArrays);

        for(int i = 0; i < inputStringArrays.length; i++){
            bw.write(inputStringArrays[i] + "\n");
        }

        bw.flush();
        bw.close();

    }
}
