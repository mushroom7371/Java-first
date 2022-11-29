package BaekJoon;

import java.io.*;

//거스름돈
public class N5585 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int money = 1000 - Integer.parseInt(br.readLine());
        int count = 0;

        if (money / 500 > 0) {
            count += money / 500;
            money %= 500;
        }

        if (money / 100 > 0) {
            count += money / 100;
            money %= 100;
        }

        if (money / 50 > 0) {
            count += money / 50;
            money %= 50;
        }

        if (money / 10 > 0) {
            count += money / 10;
            money %= 10;
        }

        if (money / 5 > 0) {
            count += money / 5;
            money %= 5;
        }

        if (money / 1 > 0) {
            count += money / 1;
            money %= 1;
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5585().solution();
    }
}
