package BaekJoon;

import java.io.*;
import java.util.Arrays;

//Hard choice
public class N15059 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] foodArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] requiredArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = 0;
        for (int i = 0; i < 3; i++) {
            if (foodArray[i] < requiredArray[i]) {
                result += requiredArray[i] - foodArray[i];
            }
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15059().solution();
    }
}
