package BaekJoon;

import java.io.*;

//회문은 회문아니야!
public class N15927 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputString = br.readLine();
        int length = inputString.length();

        while (length --> 0) {
            if (isPalindrome(inputString)) {
            }
        }


        br.close();
        bw.flush();
        bw.close();
    }
    boolean isPalindrome(String inputString) {
        boolean isPalindrome = true;
        int inputLength = inputString.length();

        for(int i = 0; i < inputLength/2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputLength -1 -i)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) throws IOException {
        new N15927().solution();
    }
}
