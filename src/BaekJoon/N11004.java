package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//K번째 수(Arrays.sort() 사용)
public class N11004 {
    //퀵소트로 다시 풀어볼 예정, 아래 코드는 따로 설명 하지 않음
    void solution()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrayLength = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int [] numberArray = new int[arrayLength];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < arrayLength; i++){
            int number = Integer.parseInt(st.nextToken());

            numberArray[i] = number;

        }

        Arrays.sort(numberArray);

        bw.write(numberArray[K - 1] + "");

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N11004().solution();
    }
}
