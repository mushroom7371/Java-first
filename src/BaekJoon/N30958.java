package BaekJoon;

import java.io.*;

//서울사이버대학을 다니고
public class N30958 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int[] alphabet = new int[26];

        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a']++;
            }
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
            }
        }

        bw.write(max + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30958().solution();
    }
}
