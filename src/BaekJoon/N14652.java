package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//나는 행복합니다~
public class N14652 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int targetRow = target / col;
        int targetCol = target % col;

        bw.write(targetRow + " " + targetCol);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14652().solution();
    }
}
