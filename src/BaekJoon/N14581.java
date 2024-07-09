package BaekJoon;

import java.io.*;

//팬들에게 둘러싸인 홍준
public class N14581 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String id = ":" + br.readLine() + ":";
        String fan = ":fan:";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    bw.write(id);
                } else {
                    bw.write(fan);
                }
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14581().solution();
    }
}
