package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//2차원 배열의 합
public class N2167 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int numberOfQuestion = Integer.parseInt(br.readLine());
        while (numberOfQuestion --> 0) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            int startRow = Integer.parseInt(st.nextToken()) - 1;
            int startCol = Integer.parseInt(st.nextToken()) - 1;
            int endRow = Integer.parseInt(st.nextToken()) - 1;
            int endCol = Integer.parseInt(st.nextToken()) - 1;

            for (int i = startRow; i <= endRow; i++) {
                for (int j = startCol; j <= endCol; j++) {
                    sum += array[i][j];
                }
            }

            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2167().solution();
    }
}
