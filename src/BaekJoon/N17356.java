package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//욱 제
public class N17356 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int uk = Integer.parseInt(st.nextToken());
        int je = Integer.parseInt(st.nextToken());

        double result = 1 / (1 + Math.pow(10, (je - uk) / 400.0));

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17356().solution();
    }
}
