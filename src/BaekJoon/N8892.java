package BaekJoon;

import java.io.*;

//팰린드롬
public class N8892 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            boolean isPalindrome = false;
            int words = Integer.parseInt(br.readLine());
            String [] wordArray = new String[words];

            for (int i = 0; i < words; i++) {
                wordArray[i] = br.readLine();
            }

            String result = "";
            loop:
            for (int i = 0; i < words-1; i++) {
                for (int j = i + 1; j < words; j++) {
                    String temp = wordArray[i] + wordArray[j];
                    String reverseTemp = wordArray[j] + wordArray[i];
                    if (isPalindrome(temp)) {
                        result = temp;
                        break loop;
                    }
                    if (isPalindrome(reverseTemp)) {
                        result = reverseTemp;
                        break loop;
                    }
                }
            }

            if (result.length() > 0) {
               bw.write(result +"\n");
            } else {
                bw.write("0\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    boolean isPalindrome (String target) {
        boolean isPalindrome = true;

        for(int i = 0; i < target.length()/2; i++) {
            if (target.charAt(i) != target.charAt(target.length() -1 -i)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) throws IOException {
        new N8892().solution();
    }
}
