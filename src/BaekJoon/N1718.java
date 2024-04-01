package BaekJoon;

import java.io.*;

//암호
public class N1718 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String plainText = br.readLine();
        String key = br.readLine();

        int keyLength = key.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if (c == ' ') {
                sb.append(' ');
                continue;
            }
            int keyIndex = i % keyLength;
            int keyChar = key.charAt(keyIndex) - 'a';
            int plainChar = c - 'a';
            int result = plainChar - keyChar - 1;
            if (result < 0) {
                result += 26;
            }
            sb.append((char) (result + 'a'));
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1718().solution();
    }
}
