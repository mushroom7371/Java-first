package BaekJoon;

import java.io.*;

//골뱅이 찍기 - ㄷ
public class N23804 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5*n; j++)
                sb.append("@");
            sb.append("\n");
        }

        for (int i = 0; i < 3*n; i++) {
            for (int j = 0; j < n; j++){
                sb.append("@");
            }
            sb.append("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5*n; j++)
                sb.append("@");
            sb.append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23804().solution();
    }
}
