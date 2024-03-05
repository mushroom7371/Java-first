package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//상근이의 체스판
public class N3076 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder black = new StringBuilder();
        StringBuilder white = new StringBuilder();

        for (int i = 0; i < b; i++) {
            black.append("X");
            white.append(".");
        }

        StringBuilder blackStart = new StringBuilder();
        StringBuilder whiteStart = new StringBuilder();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                if (j % 2 == 0) {
                    blackStart.append(black);
                    whiteStart.append(white);
                } else {
                    blackStart.append(white);
                    whiteStart.append(black);
                }
            }

            if (i != a - 1) {
                blackStart.append("\n");
                whiteStart.append("\n");
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                result.append(blackStart);
            } else {
                result.append(whiteStart);
            }

            if (i != r - 1) {
                result.append("\n");
            }
        }

        bw.write(result.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N3076().solution();
    }
}
