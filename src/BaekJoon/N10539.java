package BaekJoon;

import java.io.*;
import java.util.Arrays;

//수빈이와 수열
public class N10539 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arrayLength = Integer.parseInt(br.readLine());
        int [] inputArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] originArray = new int[arrayLength];
        originArray[0] = inputArray[0];
        int sum = 0;

        bw.write(originArray[0] + " ");

        for (int i = 1; i < arrayLength; i++) {
            sum += originArray[i-1];
            originArray[i] = inputArray[i]*(i+1) - sum;
            bw.write(originArray[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10539().solution();
    }
}
