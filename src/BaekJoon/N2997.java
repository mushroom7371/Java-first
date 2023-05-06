package BaekJoon;

import java.io.*;
import java.util.Arrays;

//네 번째 수
public class N2997 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] inputArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int first = inputArray[1] - inputArray[0];
        int second = inputArray[2] - inputArray[1];
        int result = 0;

        if (first == second) {
            result = inputArray[2] + first;
        } else {
            if (inputArray[2]-(inputArray[1] + first) == first) {
                result = inputArray[1]+ first;
            } else {
                result = inputArray[0] + second;
            }
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2997().solution();
    }
}
