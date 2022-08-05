package BaekJoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

//이진수 덧셈
public class N2729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            st = new StringTokenizer(br.readLine());
            BigInteger number1 = new BigInteger(st.nextToken(), 2);
            BigInteger number2 = new BigInteger(st.nextToken(), 2);

            BigInteger sum = number1.add(number2);

            bw.write(sum.toString(2) + "\n");

        }

        br.close();
        bw.flush();
        bw.close();

    }
}
