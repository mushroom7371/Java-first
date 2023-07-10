package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//알파벳 거리
public class N5218 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine());
            String wordA = st.nextToken();
            String wordB = st.nextToken();
            bw.write("Distances: ");

            for (int i = 0; i < wordA.length(); i++) {
                int alphabetNumberA = getAlphabetNumber(wordA.charAt(i));
                int alphabetNumberB = getAlphabetNumber(wordB.charAt(i));

                if (alphabetNumberA > alphabetNumberB) {
                    bw.write((alphabetNumberB + 26 - alphabetNumberA) + " ");
                } else {
                    bw.write((alphabetNumberB - alphabetNumberA) + " ");
                }
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    int getAlphabetNumber(char alphabet) {
        return alphabet - 'A' + 1;
    }

    public static void main(String[] args) throws IOException {
        new N5218().solution();
    }
}
