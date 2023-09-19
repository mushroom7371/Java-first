package BaekJoon;

import java.io.*;

//신용카드 판별
public class N14726 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String[] cardNumber = br.readLine().split("");

            for (int i = cardNumber.length-1; i >= 0; i--) {
                if (i % 2 == 0) {
                    int temp = Integer.parseInt(cardNumber[i]) * 2;
                    if (temp >= 10) {
                        cardNumber[i] = String.valueOf(temp - 9);
                    } else {
                        cardNumber[i] = String.valueOf(temp);
                    }
                }
            }

            int result = 0;
            for (int i = 0; i < cardNumber.length; i++) {
                result += Integer.parseInt(cardNumber[i]);
            }

            if (result % 10 == 0) {
                bw.write("T\n");
            } else {
                bw.write("F\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14726().solution();
    }
}
