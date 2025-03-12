package BaekJoon;

import java.io.*;

//Java Bitecode
public class N21867 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int strLength = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strLength; i++) {
            char c = input.charAt(i);
            if (c != 'J' && c != 'A' && c != 'V') {
                result.append(c);
            }
        }

        if (result.length() == 0) {
            bw.write("nojava");
        } else {
            bw.write(result.toString());
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N21867().solution();
    }
}
