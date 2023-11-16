package BaekJoon;

import java.io.*;

//피보나치 비스무리한 수열
public class N11495 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());

        long[] fakeFibonacciArray = new long[117];
        fakeFibonacciArray[1] = 1;
        fakeFibonacciArray[2] = 1;
        fakeFibonacciArray[3] = 1;

        for (int i = 4; i <= number; i++) {
            fakeFibonacciArray[i] = fakeFibonacciArray[i-1] + fakeFibonacciArray[i-3];
        }

        bw.write(fakeFibonacciArray[number] + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11495().solution();
    }
}
