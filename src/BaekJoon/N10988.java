package BaekJoon;

import java.io.*;

//팰린드롬인지 확인하기
public class N10988 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int inputLength = input.length();
        boolean isPalindrome = true;

        for(int i = 0; i < inputLength/2; i++) {
            if (input.charAt(i) != input.charAt(inputLength -1 -i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10988().solution();
    }
}
