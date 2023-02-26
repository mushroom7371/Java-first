package BaekJoon;

import java.io.*;
import java.util.Arrays;

//행복
public class N15969 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int [] numberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = numberArray[0];
        int min = numberArray[0];

        for (int i = 0; i < testCase; i++) {
            if (max < numberArray[i]) {
                max = numberArray[i];
            }

            if (min > numberArray[i]) {
                min = numberArray[i];
            }
        }

        int result = max - min;

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15969().solution();
    }
}
