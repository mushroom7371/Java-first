package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//행렬 덧셈
public class N2738 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                bw.write(matrix1[i][j] + matrix2[i][j] + " ");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2738().solution();
    }
}
