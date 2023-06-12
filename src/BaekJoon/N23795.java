package BaekJoon;

import java.io.*;

public class N23795 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;

        while (true) {
            int money = Integer.parseInt(br.readLine());

            if (money == -1) {
                break;
            }

            sum += money;
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23795().solution();
    }
}
