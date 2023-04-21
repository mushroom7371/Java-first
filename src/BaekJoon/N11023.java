package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//더하기 3
public class N11023 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;

        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11023().solution();
    }
}
