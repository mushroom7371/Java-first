package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//색종이 - 2
public class N2567 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[][] board = new boolean[101][101];
        int numberOfPaper = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i < numberOfPaper; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    board[j][k] = true;
                }
            }
        }

        for (int i = 1; i < board.length-1; i++) {
            for (int j = 1; j < board[i].length-1; j++) {
                if (board[i][j]) {
                    if (!board[i-1][j]) {
                        sum++;
                    }
                    if (!board[i+1][j]) {
                        sum++;
                    }
                    if (!board[i][j-1]) {
                        sum++;
                    }
                    if (!board[i][j+1]) {
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
        new N2567().solution();
    }
}
