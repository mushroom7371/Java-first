package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//이진수 덧셈
public class N1252 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder firstBinary = new StringBuilder(st.nextToken());
        StringBuilder secondBinary = new StringBuilder(st.nextToken());
        StringBuilder result = new StringBuilder();

        if (firstBinary.length() > secondBinary.length()) {
            int difference = firstBinary.length() - secondBinary.length();
            for (int i = 0; i < difference; i++) {
                secondBinary.insert(0, "0");
            }
        } else if (firstBinary.length() < secondBinary.length()) {
            int difference = secondBinary.length() - firstBinary.length();
            for (int i = 0; i < difference; i++) {
                firstBinary.insert(0, "0");
            }
        }

        int carry = 0;
        for (int i = firstBinary.length()-1; i >= 0; i--) {
            int first = Integer.parseInt(String.valueOf(firstBinary.charAt(i)));
            int second = Integer.parseInt(String.valueOf(secondBinary.charAt(i)));
            int sum = first + second + carry;

            if (sum == 0) {
                result.insert(0, "0");
                carry = 0;
            } else if (sum == 1) {
                result.insert(0, "1");
                carry = 0;
            } else if (sum == 2) {
                result.insert(0, "0");
                carry = 1;
            } else if (sum == 3) {
                result.insert(0, "1");
                carry = 1;
            }
        }

        if (carry == 1) {
            result.insert(0, "1");
        }

        while (result.charAt(0) == '0' && result.length() > 1) {
            result.deleteCharAt(0);
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1252().solution();
    }
}
