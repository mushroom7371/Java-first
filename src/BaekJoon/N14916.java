package BaekJoon;

import java.io.*;

//거스름돈
public class N14916 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int money = Integer.parseInt(br.readLine());
        int count = 0;

        while (money > 0) {
            if (money % 5 == 0) {
                count += money / 5;
                money = 0;
            } else {
                money -= 2;
                count++;
            }
        }

        if (money < 0) {
            count = -1;
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14916().solution();
    }
}
