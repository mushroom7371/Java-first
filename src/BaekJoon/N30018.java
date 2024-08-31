package BaekJoon;

import java.io.*;
import java.util.Arrays;

//타슈
public class N30018 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arrA = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (arrA[i] >= arrB[i]) {
                result += arrA[i] - arrB[i];
            }
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30018().solution();
    }
}
