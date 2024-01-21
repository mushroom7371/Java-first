package BaekJoon;

import java.io.*;

//복호화
public class N9046 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int[] alphabet = new int[26];
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') {
                    alphabet[s.charAt(i) - 'a']++;
                }
            }

            int max = 0;
            int maxIndex = 0;
            for (int i = 0; i < alphabet.length; i++) {
                if (max < alphabet[i]) {
                    max = alphabet[i];
                    maxIndex = i;
                }
            }

            int count = 0;
            for (int i = 0; i < alphabet.length; i++) {
                if (max == alphabet[i]) {
                    count++;
                }
            }

            if (count > 1) {
                bw.write("?\n");
            } else {
                bw.write((char) (maxIndex + 'a') + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9046().solution();
    }
}
