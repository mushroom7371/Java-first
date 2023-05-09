package BaekJoon;

import java.io.*;

//골뱅이 찍기 - ㄴ
public class N23803 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("@");
        }

        String result = String.valueOf(sb);
        for (int i = 0; i < n*5 -n; i++) {
            bw.write(result + "\n");
        }

        for (int i = 0; i < 4; i++) {
            sb.append(result);
        }

        result = String.valueOf(sb);
        for (int i = 0; i < n; i++) {
            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23803().solution();
    }
}
