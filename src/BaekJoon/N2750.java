package BaekJoon;

import java.io.*;
import java.util.Arrays;

//수 정렬하기
public class N2750 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] arr = new int[Integer.parseInt(br.readLine())];  //첫줄에 주어진 수만큼의 크기를 가지는 배열 선언

        for(int i = 0; i < arr.length; i++){    //둘째 줄 부터 마지막 줄까지의 숫자를 배열의 각 위치에 저장
            arr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
        Arrays.sort(arr);   //정렬 메서드 이용

        for(int i = 0; i < arr.length; i++){    //버퍼에 기록
            bw.write(arr[i] + "" + "\n");
        }

        bw.flush();
        bw.close();

    }
}
