package BaekJoon;

import java.io.*;

//Fill the Rowboats!
public class N5300 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            bw.write(i + " ");

            if (i % 6 == 0 || i == n) {
                bw.write("Go! ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5300().solution();
    }
}