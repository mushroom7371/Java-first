package BaekJoon;

import java.io.*;
import java.util.Arrays;

//점수 집계
public class N9076 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int [] scoreArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

            if (scoreArray[3] - scoreArray[1] >= 4) {
                bw.write("KIN" + "\n");
            } else {
                int sum = scoreArray[1] + scoreArray[2] + scoreArray[3];
                bw.write(sum + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9076().solution();
    }
}
