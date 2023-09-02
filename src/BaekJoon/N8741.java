package BaekJoon;

import java.io.*;

//이진수 합
public class N8741 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input; i++) {
            sb.append("1");
        }

        for (int i = 0; i < input - 1; i++) {
            sb.append("0");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N8741().solution();
    }
}
