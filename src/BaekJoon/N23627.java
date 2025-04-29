package BaekJoon;

import java.io.*;

//driip
public class N23627 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        boolean isCute = false;

        StringBuilder sb = new StringBuilder();
        if (input.length() > 5) {
            for (int i = 0; i < 5; i++) {
                int reverseIndex = input.length() - 1 - i;
                sb.append(input.charAt(reverseIndex));
            }
        }

        if (sb.toString().equals("piird")) {
            isCute = true;
        }

        if (isCute) {
            bw.write("cute");
        } else {
            bw.write("not cute");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23627().solution();
    }
}
