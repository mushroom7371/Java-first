package BaekJoon;

import java.io.*;
import java.util.Arrays;

//Easy-to-Solve Expressions
public class N25784 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        if (arr[0] + arr[1] == arr[2]) {
            bw.write("1");
        } else if (arr[0] * arr[1] == arr[2]) {
            bw.write("2");
        } else {
            bw.write("3");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25784().solution();
    }
}
