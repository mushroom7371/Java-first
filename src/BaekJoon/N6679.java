package BaekJoon;

import java.io.*;

//싱기한 네자리 숫자
public class N6679 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1000; i <= 9999; i++) {
            String decimal = String.valueOf(i);
            String duodecimal = Integer.toString(i, 12);
            String hex = Integer.toString(i, 16);

            int decimalSum = 0;
            int duodecimalSum = 0;
            int hexSum = 0;

            for (int j = 0; j < decimal.length(); j++) {
                decimalSum += Integer.parseInt(decimal.substring(j, j+1));
            }

            for (int j = 0; j < duodecimal.length(); j++) {
                duodecimalSum += Integer.parseInt(duodecimal.substring(j, j+1), 12);
            }

            for (int j = 0; j < hex.length(); j++) {
                hexSum += Integer.parseInt(hex.substring(j, j+1), 16);
            }

            if (decimalSum == duodecimalSum && duodecimalSum == hexSum) {
                bw.write(String.valueOf(i) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6679().solution();
    }
}
