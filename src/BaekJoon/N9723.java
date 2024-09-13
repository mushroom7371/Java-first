package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//Right Triangle
public class N9723 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            boolean isRight = Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2);
            bw.write("Case #" + i + ": " + (isRight ? "YES" : "NO") + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9723().solution();
    }
}
