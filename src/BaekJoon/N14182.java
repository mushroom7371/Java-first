package BaekJoon;

import java.io.*;

//Tax
public class N14182 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int income = Integer.parseInt(br.readLine());
            if (income == 0) {
                break;
            }

            if (income > 5000000) {
                income = (int) (income * 0.8);
            } else if (income > 1000000) {
                income = (int) (income * 0.9);
            }

            bw.write(income + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14182().solution();
    }
}
