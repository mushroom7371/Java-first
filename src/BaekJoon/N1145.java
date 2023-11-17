package BaekJoon;

import java.io.*;
import java.util.Arrays;

//적어도 대부분의 배수
public class N1145 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = 1;
        int count = 0;

        while (count < 3) {
            count = 0;
            for (int i = 0; i < numberArray.length; i++) {
                if (number % numberArray[i] == 0) {
                    count++;
                }
            }
            number++;
        }

        bw.write(number - 1 + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1145().solution();
    }
}
