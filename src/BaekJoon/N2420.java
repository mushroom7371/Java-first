package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//사파리월드
public class N2420 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());;
        long b = Long.parseLong(st.nextToken());;

        long result = Math.abs(a - b);
        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2420().solution();
    }
}
