package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//삼각형
public class N29751 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double w = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());
        double result = w * h / 2;

        bw.write(String.format("%.1f", result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29751().solution();
    }
}
