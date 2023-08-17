package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//N M 찍기
public class N18883 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= M; j++) {
                if (j == M)
                    bw.write(++count + "");
                else
                    bw.write(++count + " ");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N18883().solution();
    }
}
