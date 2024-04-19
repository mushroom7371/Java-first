package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//UCPC는 무엇의 약자일까?
public class N15904 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();

            for (int i = 0; i < token.length(); i++) {
                char c = token.charAt(i);

                if (c == 'U' || c == 'C' || c == 'P') {
                    sb.append(c);
                }
            }
        }

        boolean isU = false;
        boolean isC = false;
        boolean isP = false;
        boolean isC2 = false;

        String result = sb.toString();
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);

            if (!isU && c == 'U') {
                isU = true;
            } else if (isU && !isC && c == 'C') {
                isC = true;
            } else if (isU && isC && !isP && c == 'P') {
                isP = true;
            } else if (isU && isC && isP && !isC2 && c == 'C') {
                isC2 = true;
            }
        }

        if (isU && isC && isP && isC2) {
            bw.write("I love UCPC");
        } else {
            bw.write("I hate UCPC");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15904().solution();
    }
}
