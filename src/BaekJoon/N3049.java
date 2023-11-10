package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//다각형의 대각선
public class N3049 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int numberOfDiagonal = (n * (n - 1) * (n - 2) * (n - 3)) / 24;

        bw.write(numberOfDiagonal + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N3049().solution();
    }
}
