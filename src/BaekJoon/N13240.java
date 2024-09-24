package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Chessboard
public class N13240 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < col; i++) {
            if (i % 2 == 0) {
                odd.append("*");
                even.append(".");
            } else {
                odd.append(".");
                even.append("*");
            }
        }

        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                bw.write(odd + "\n");
            } else {
                bw.write(even + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13240().solution();
    }
}
