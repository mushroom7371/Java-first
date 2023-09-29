package BaekJoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

//암호제작
public class N1837 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger prime = new BigInteger(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean isBad = false;

        for (int i = 2; i < k; i++) {
            if (prime.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                isBad = true;
                bw.write("BAD " + i);
                break;
            }
        }

        if (!isBad) bw.write("GOOD");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1837().solution();
    }
}
