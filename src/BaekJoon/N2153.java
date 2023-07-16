package BaekJoon;

import java.io.*;

//소수 단어
public class N2153 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        int wordSum = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                wordSum += word.charAt(i) - 'a' + 1;
            } else {
                wordSum += word.charAt(i) - 'A' + 27;
            }
        }

        boolean isPrime = true;
        for (int i = 2; i < wordSum; i++) {
            if (wordSum % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            bw.write("It is a prime word.");
        } else {
            bw.write("It is not a prime word.");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2153().solution();
    }
}
