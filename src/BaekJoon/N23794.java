package BaekJoon;

import java.io.*;

//골뱅이 찍기 - 정사각형
public class N23794 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n + 2; i++) {
            sb.append("@");
        }
        sb.append("\n");

        for (int i = 0; i < n; i++) {
            sb.append("@");
            for (int j = 0; j < n; j++) {
                sb.append(" ");
            }
            sb.append("@\n");
        }

        for (int i = 0; i < n + 2; i++) {
            sb.append("@");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23794().solution();
    }
}
