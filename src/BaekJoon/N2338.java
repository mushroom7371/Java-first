package BaekJoon;

import java.io.*;
import java.math.BigInteger;

//긴자리 계산
public class N2338 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        bw.write(a.add(b) + "\n");
        bw.write(a.subtract(b) + "\n");
        bw.write(a.multiply(b) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2338().solution();
    }
}
