package BaekJoon;

import java.io.*;
import java.util.Arrays;

//2 番目に大きい整数 (The Second Largest Integer)
public class N20976 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        bw.write(numberArray[1] + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N20976().solution();
    }
}
