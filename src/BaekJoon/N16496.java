package BaekJoon;

import java.io.*;
import java.math.BigInteger;

//큰 수 만들기
public class N16496 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfNumbers = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberOfNumbers; i++) {
            for (int j = i + 1; j < numberOfNumbers; j++) {
                BigInteger first = new BigInteger(numbers[i] + numbers[j]);
                BigInteger second = new BigInteger(numbers[j] + numbers[i]);

                if (first.compareTo(second) < 0) {
                    String temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

            result.append(numbers[i]);
        }

        boolean isZero = false;

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != '0') {
                isZero = true;
                break;
            }
        }
        if (!isZero) {
            result = new StringBuilder("0");
        }

        bw.write(result.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16496().solution();
    }
}
