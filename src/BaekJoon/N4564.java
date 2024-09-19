package BaekJoon;

import java.io.*;

//숫자 카드놀이
public class N4564 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String number = br.readLine();
            if (number.equals("0")) {
                break;
            }

            while (number.length() > 1) {
                bw.write(number + " ");
                int result = 1;
                for (int i = 0; i < number.length(); i++) {
                    result *= number.charAt(i) - '0';
                }
                number = result + "";
            }

            bw.write(number + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4564().solution();
    }
}
