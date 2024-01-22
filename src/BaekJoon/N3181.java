package BaekJoon;

import java.io.*;

//줄임말 만들기
public class N3181 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            String s = input[i];
            char c = s.toUpperCase().charAt(0);
            if (i == 0) {
                sb.append(c);
            } else {
                if (s.equals("i") || s.equals("pa") || s.equals("te") || s.equals("ni") || s.equals("niti") ||
                        s.equals("a") || s.equals("ali") || s.equals("nego") || s.equals("no") || s.equals("ili")) {
                } else {
                    sb.append(c);
                }
            }
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N3181().solution();
    }
}
