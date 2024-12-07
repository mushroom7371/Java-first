package BaekJoon;

import java.io.*;
import java.util.Arrays;

//Missing Runners
public class N16546 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] inputArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] resultArr = new int[n + 1];

        for (int i = 0; i < inputArr.length; i++) {
            resultArr[inputArr[i]]++;
        }

        for (int i = 1; i < resultArr.length; i++) {
            if (resultArr[i] == 0) {
                bw.write(i + "");
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16546().solution();
    }
}
