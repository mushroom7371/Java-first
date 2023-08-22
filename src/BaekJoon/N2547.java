package BaekJoon;

import java.io.*;
import java.math.BigInteger;

//사탕 선생 고창영
public class N2547 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int testCount = 0;

        while (true) {
            String input = br.readLine();
            if (input.equals("")) {
                testCount++;
            }

            int numberOfStudent = Integer.parseInt(br.readLine());
            BigInteger sum = new BigInteger("0");

            for (int i = 0; i < numberOfStudent; i++) {
                sum = sum.add(new BigInteger(br.readLine()));
            }

            String result = String.valueOf(sum.remainder(BigInteger.valueOf(numberOfStudent)));
            if (result.equals("0")) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }

            if (testCount == testCase) {
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2547().solution();
    }
}
