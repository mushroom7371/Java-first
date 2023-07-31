package BaekJoon;

import java.io.*;
import java.util.Arrays;

//주차의 신
public class N5054 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int numberOfShop = Integer.parseInt(br.readLine());
            int[] shopDistance = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

            int result = 0;
            for (int i = numberOfShop-1; i > 0; i--) {
                result += shopDistance[i] - shopDistance[i-1];
            }

            bw.write(result*2 + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5054().solution();
    }
}
