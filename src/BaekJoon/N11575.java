package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Affine Cipher
public class N11575 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();
            String input = br.readLine();
            for (int i = 0; i < input.length(); i++) {
                sb.append(encrypt(input.charAt(i), a, b));
            }

            bw.write(sb + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    char encrypt(char c, int a, int b) {
        return (char) ((a * (c - 'A') + b) % 26 + 'A');
    }

    public static void main(String[] args) throws IOException {
        new N11575().solution();
    }
}
