package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//질투진서
public class N15784 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int jinSeoRow = Integer.parseInt(st.nextToken());
        int jinSeoCol = Integer.parseInt(st.nextToken());

        boolean isJealous = false;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int jinSeoScore = arr[jinSeoRow - 1][jinSeoCol - 1];

        for (int i = 0; i < n; i++) {
            if (arr[i][jinSeoCol - 1] > jinSeoScore) {
                isJealous = true;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[jinSeoRow - 1][i] > jinSeoScore) {
                isJealous = true;
                break;
            }
        }

         if (isJealous) {
             bw.write("ANGRY");
         } else {
             bw.write("HAPPY");
         }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15784().solution();
    }
}
