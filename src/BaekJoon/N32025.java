package BaekJoon;

import java.io.*;

//체육은 수학과목 입니다
public class N32025 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double h = Double.parseDouble(br.readLine());
        double w = Double.parseDouble(br.readLine());

        double min = Math.min(h, w);
        double result = min /2 * 100;

        bw.write((int)result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32025().solution();
    }
}
