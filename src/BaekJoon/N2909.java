package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

///캔디 구매
public class N2909 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int priceOfCandy = Integer.parseInt(st.nextToken());
        int round = Integer.parseInt(st.nextToken());

        int roundingDigit = (int) Math.pow(10, round);
        int result = ((priceOfCandy + roundingDigit / 2) / roundingDigit) * roundingDigit;

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2909().solution();
    }
}
