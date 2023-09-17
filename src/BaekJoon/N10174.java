package BaekJoon;

import java.io.*;

//팰린드롬
public class N10174 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            char[] inputCharArray = br.readLine().toLowerCase().toCharArray();
            boolean isPalindrome = true;

            for (int i = 0; i < inputCharArray.length / 2; i++) {
                if (inputCharArray[i] != inputCharArray[inputCharArray.length - 1 - i]) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                bw.write("Yes\n");
            } else {
                bw.write("No\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10174().solution();
    }
}
