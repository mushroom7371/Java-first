package BaekJoon;

import java.io.*;
import java.util.Arrays;

//검증수
public class N2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] serialNumberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();   //주어진 입력을 공백으로 나눠 int 배열에 저장 N2693참고 
        int sumForVerification = 0;

        for(int i = 0; i < serialNumberArray.length; i++){  //반복을 돌면서 i번지의 데이터를 제곱한 수를 더해준다.
            sumForVerification += Math.pow(serialNumberArray[i], 2);
        }

        br.close();
        bw.write((sumForVerification % 10) + "");   //합계를 10으로 나눈 나머지를 출력
        bw.flush();

    }
}
