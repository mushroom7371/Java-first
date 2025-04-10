package BaekJoon;

import java.io.*;
import java.math.BigInteger;

//선택 가능성이 가장 높은 자료형
public class N32278 {

    //todo 직접 구현해보기
    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger number = new BigInteger(br.readLine());

        BigInteger shortNumber = BigInteger.valueOf(32767L);
        BigInteger minusShortNumber = BigInteger.valueOf(-32768L);
        BigInteger longNumber = BigInteger.valueOf(2147483647L);
        BigInteger minusLongNumber = BigInteger.valueOf(-2147483648L);
        BigInteger longLongNumber = BigInteger.valueOf(9223372036854775807L);
        BigInteger minusLongLongNumber = BigInteger.valueOf(-9223372036854775808L);

        if (number.compareTo(shortNumber) <= 0 && number.compareTo(minusShortNumber) >= 0) {
            bw.write("short");
        } else if (number.compareTo(longNumber) <= 0 && number.compareTo(minusLongNumber) >= 0) {
            bw.write("int");
        } else if (number.compareTo(longLongNumber) <= 0 && number.compareTo(minusLongLongNumber) >= 0) {
            bw.write("long long");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32278().solution();
    }
}
