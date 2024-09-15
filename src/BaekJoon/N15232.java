package BaekJoon;

import java.io.*;

//Rectangles
public class N15232 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int row = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15232().solution();
    }
}
