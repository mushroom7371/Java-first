package BaekJoon;

import java.io.*;
import java.math.BigInteger;

//숫자의 개수2
public class N21567 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        BigInteger result = BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).multiply(BigInteger.valueOf(c));
        int[] arr = new int[10];

        while (result.compareTo(BigInteger.ZERO) > 0) {
            arr[result.mod(BigInteger.TEN).intValue()]++;
            result = result.divide(BigInteger.TEN);
        }

        for (int i : arr) {
            bw.write(i + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N21567().solution();
    }
}
