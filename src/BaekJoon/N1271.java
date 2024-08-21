package BaekJoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

//엄청난 부자2
public class N1271 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger money = new BigInteger(st.nextToken());
        BigInteger creature = new BigInteger(st.nextToken());

        bw.write(money.divide(creature) + "\n" + money.remainder(creature));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1271().solution();
    }
}
