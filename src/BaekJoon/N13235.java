package BaekJoon;

import java.io.*;

//팰린드롬
public class N13235 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String target = br.readLine();
        boolean isPalindrome = true;

        for (int i = 0; i < target.length()/2; i++) {
            if (target.charAt(i) != target.charAt(target.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            bw.write("true");
        } else {
            bw.write("false");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13235().solution();
    }
}
