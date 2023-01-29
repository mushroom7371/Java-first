package BaekJoon;

import java.io.*;

//369
public class N17614 {

    void solution () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            String number = String.valueOf(i);

            for (int j = 0; j < number.length(); j++) {
                int tempNumber = number.charAt(j) - '0';

                if (tempNumber == 3 || tempNumber == 6 || tempNumber == 9) {
                    sum++;
                }
            }
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17614().solution();
    }
}
