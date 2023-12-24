package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//햄버거 만들기
public class N25628 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bread = Integer.parseInt(st.nextToken());
        int ham = Integer.parseInt(st.nextToken());
        int count = 0;

        while (bread >= 2 && ham >= 1) {
            bread -= 2;
            ham -= 1;
            count++;
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25628().solution();
    }
}
