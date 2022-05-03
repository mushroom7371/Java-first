package BaekJoon;

import java.io.*;
import java.util.Arrays;

//수 정렬하기3
public class N10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine()); //입력 숫자의 개수
        int[] numberArrayForSort = new int[testCase];   //입력 받은 숫자를 담을 배열 선언

        for (int i = 0; i < testCase; i++) {    //String to int 형변환
            numberArrayForSort[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        Arrays.sort(numberArrayForSort);    //배열에 담긴 숫자 정렬

        for (int i = 0; i < testCase; i++) {    //출력
            bw.write(numberArrayForSort[i] + "" + "\n");
        }

        bw.flush();
        bw.close();

    }
}
