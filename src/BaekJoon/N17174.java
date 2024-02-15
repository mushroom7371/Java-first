package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//전체 계산 횟수
public class N17174 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int count = n;
        while (n >= m) {
            n /= m;
            count += n;
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17174().solution();
    }
}
