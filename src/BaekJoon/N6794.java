package BaekJoon;

import java.io.*;

//What is n, Daddy?
public class N6794 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int target = Integer.parseInt(br.readLine());

        boolean[] check = new boolean[6];
        int count = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i + j == target) {
                    check[i] = true;
                }
            }
        }
        for (int i = 0; i <= target/2; i++) {
            if (check[i]) {
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6794().solution();
    }
}
