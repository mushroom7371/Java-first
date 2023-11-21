package BaekJoon;

import java.io.*;
import java.math.BigInteger;

//피보나치 수
public class N4150 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());

        BigInteger[] fibonacciArray = new BigInteger[number + 1];

        if (number == 0) {
            bw.write("0");
            br.close();
            bw.flush();
            bw.close();
            return;
        } else if (number == 1 || number == 2) {
            bw.write("1");
            br.close();
            bw.flush();
            bw.close();
            return;
        }
        fibonacciArray[0] = BigInteger.ZERO;
        fibonacciArray[1] = BigInteger.ONE;
        fibonacciArray[2] = BigInteger.ONE;

        for (int i = 3; i <= number; i++) {
            fibonacciArray[i] = fibonacciArray[i-1].add(fibonacciArray[i-2]);
        }

        bw.write(fibonacciArray[number] + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4150().solution();
    }
}
