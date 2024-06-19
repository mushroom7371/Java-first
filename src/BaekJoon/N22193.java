package BaekJoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

//Multiply
public class N22193 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstNumberLength = Integer.parseInt(st.nextToken());
        int secondNumberLength = Integer.parseInt(st.nextToken());

        BigInteger firstNumber = new BigInteger(br.readLine());
        BigInteger secondNumber = new BigInteger(br.readLine());

        BigInteger result = firstNumber.multiply(secondNumber);
        bw.write(result.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N22193().solution();
    }
}
