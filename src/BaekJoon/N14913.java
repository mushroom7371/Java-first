package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//등차수열에서 항 번호 찾기
public class N14913 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int result = (k - a + d) / d;
        if (result < 1 || (k - a) % d != 0) {
            bw.write("X");
        } else {
            bw.write(result + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14913().solution();
    }
}
