package BaekJoon;

import java.io.*;
import java.util.Arrays;

//3 つの整数 (Three Integers)
public class N18408 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] count = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                count[0]++;
            } else {
                count[1]++;
            }
        }

        if (count[0] > count[1]) {
            bw.write("1");
        } else {
            bw.write("2");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N18408().solution();
    }
}
