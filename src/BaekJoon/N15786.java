package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Send me the money
public class N15786 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lengthOfSecretAlphabet = Integer.parseInt(st.nextToken());
        int numberOfPostIt = Integer.parseInt(st.nextToken());
        String secretAlphabet = br.readLine();

        while (numberOfPostIt --> 0) {
            StringBuilder sb = new StringBuilder(secretAlphabet);
            String postIt = br.readLine();

            for (int i = 0; i < postIt.length(); i++) {
                if (sb.isEmpty()) { //자바 버전이 안맞아서 컴파일 오류시 sb.length() == 0 으로 변경
                    break;
                }

                if (postIt.charAt(i) == sb.charAt(0)) {
                    sb.deleteCharAt(0);
                }
            }

            if (sb.isEmpty()) {
                bw.write("true\n");
            } else {
                bw.write("false\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15786().solution();
    }
}
