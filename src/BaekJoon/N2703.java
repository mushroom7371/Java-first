package BaekJoon;

import java.io.*;

//Cryptoquote
public class N2703 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String original = br.readLine();
            String[] crypto = br.readLine().split("");
            char[] alphabet = new char[26];

            for (int i = 0; i < crypto.length; i++) {
                alphabet[i] = crypto[i].charAt(0);
            }

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < original.length(); i++) {
                if (original.charAt(i) == ' ') {
                    result.append(" ");
                } else {
                    result.append(alphabet[original.charAt(i) - 'A']);
                }
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2703().solution();
    }
}
