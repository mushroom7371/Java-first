package BaekJoon;

import java.io.*;

//직사각형을 만드는 방법
public class N8320 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfSquare = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= numberOfSquare; i++) {
            for (int j = i; j <= numberOfSquare; j++) {
                if (i * j <= numberOfSquare) {
                    count++;
                }
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N8320().solution();
    }
}
