package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//색종이
public class N2563 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfPaper = Integer.parseInt(br.readLine());
        boolean[][] board = new boolean[100][100];

        int sum = 0;
        while (numberOfPaper --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    if (!board[i][j]) {
                        board[i][j] = true;
                        sum++;
                    }
                }
            }
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2563().solution();
    }
}
