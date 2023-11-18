package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//성 지키기
public class N1236 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        char[][] map = new char[row][col];

        for (int i = 0; i < row; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int countRow = 0;
        for (int i = 0; i < row; i++) {
            boolean flag = false;
            for (int j = 0; j < col; j++) {
                if (map[i][j] == 'X') {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                countRow++;
            }
        }

        int countCol = 0;
        for (int i = 0; i < col; i++) {
            boolean flag = false;
            for (int j = 0; j < row; j++) {
                if (map[j][i] == 'X') {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                countCol++;
            }
        }

        bw.write(Math.max(countRow, countCol) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1236().solution();
    }
}
