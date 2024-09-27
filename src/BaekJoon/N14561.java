package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//회문
public class N14561 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long number = Long.parseLong(st.nextToken());
            int base = Integer.parseInt(st.nextToken());

            if (isPalindrome(changeBase(number, base))) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    String changeBase(long number, int base) {
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            long remainder = number % base;
            if (remainder < 10) {
                sb.append(remainder);
            } else {
                sb.append((char) (remainder - 10 + 'A'));
            }
            number /= base;
        }
        return sb.reverse().toString();
    }

    boolean isPalindrome(String number) {
        int length = number.length();
        for (int i = 0; i < length / 2; i++) {
            if (number.charAt(i) != number.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        new N14561().solution();
    }
}
