package BaekJoon;

import java.io.*;

//알파벳 전부 쓰기
public class N11091 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            boolean[] alphabet = new boolean[26];
            String input = br.readLine().toLowerCase();

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    alphabet[c - 'a'] = true;
                }
            }

            boolean isPangram = true;
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < alphabet.length; i++) {
                if (!alphabet[i]) {
                    isPangram = false;
                    result.append((char) (i + 'a'));
                }
            }

            if (isPangram) {
                bw.write("pangram\n");
            } else {
                bw.write("missing " + result.toString() + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11091().solution();
    }
}
