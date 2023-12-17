package BaekJoon;

import java.io.*;
import java.math.BigInteger;

//부호
public class N1247 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            BigInteger sum = BigInteger.ZERO;
            int numberOfNumbers = Integer.parseInt(br.readLine());

            for (int j = 0; j < numberOfNumbers; j++) {
                sum = sum.add(new BigInteger(br.readLine()));
            }

            if (sum.compareTo(BigInteger.ZERO) == 0) {
                bw.write("0\n");
            } else if (sum.compareTo(BigInteger.ZERO) > 0) {
                bw.write("+\n");
            } else {
                bw.write("-\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1247().solution();
    }
}
