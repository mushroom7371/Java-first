package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Count Me In
public class N11319 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int consonant = 0;
            int vowel = 0;

            while (st.hasMoreTokens()) {
                String word = st.nextToken();

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                            || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'A'
                            || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O'
                            || word.charAt(i) == 'U') {
                        vowel++;
                    } else {
                        consonant++;
                    }
                }
            }

            bw.write(consonant + " " + vowel + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11319().solution();
    }
}
