package BaekJoon;

import java.io.*;

//줄번호
public class N4470 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            bw.write(i + ". " + br.readLine() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4470().solution();
    }
}
