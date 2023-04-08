package BaekJoon;

import java.io.*;
import java.util.ArrayList;

//회문인 수
public class N11068 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            boolean isPalindrome = false;
            int number = Integer.parseInt(br.readLine());

            for (int i = 2; i <= 64; i++) {
                isPalindrome = isPalindrome(number, i);

                if (isPalindrome) {
                    break;
                }
            }

            if (isPalindrome) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    boolean isPalindrome(int number, int radix) {
        ArrayList<Integer> numberArray = new ArrayList<>();

        while (number != 0) {
            numberArray.add(number%radix);
            number /= radix;
        }

        for (int i = 0; i < numberArray.size()/2; i++) {
            if (numberArray.get(i) != numberArray.get(numberArray.size() -i -1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        new N11068().solution();
    }
}
