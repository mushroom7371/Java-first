package BaekJoon;

import java.io.*;
import java.util.Arrays;

//초콜릿 자르기
public class N2163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] inputArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        
        //N행으로 주어진 초콜릿을 조각으로 나누기 위해 N-1 번이 필요하고, M열로 주어진 초콜릿을 조각으로 나누기 위해 M-1번이 필요하나 N개로 쪼개졌기에 N을 곱한다  
        answer = (inputArray[0] - 1) + (inputArray[1] - 1)*inputArray[0];

        bw.write(answer + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
