package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//삼각형 분류
public class N9366 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            int[] arr = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            bw.write("Case #" + i + ": ");
            if (arr[0] + arr[1] <= arr[2]) {
                bw.write("invalid!\n");
            } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
                bw.write("equilateral\n");
            } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
                bw.write("isosceles\n");
            } else {
                bw.write("scalene\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9366().solution();
    }
}
