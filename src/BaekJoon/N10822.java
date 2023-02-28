package BaekJoon;

import java.io.*;
import java.util.Arrays;

//더하기
public class N10822 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] numberArray = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10822().solution();
    }
}
