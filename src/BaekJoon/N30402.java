package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//감마선을 맞은 컴퓨터
public class N30402 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean isChunbae = false;
        boolean isNabi = false;
        boolean isYeongcheol = false;

        for (int i = 0; i < 15; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                if (s.equals("w")) {
                    isChunbae = true;
                } else if (s.equals("b")) {
                    isNabi = true;
                } else if (s.equals("g")) {
                    isYeongcheol = true;
                }
            }

            if (isChunbae || isNabi || isYeongcheol) {
                break;
            }
        }

        if (isChunbae) {
            bw.write("chunbae");
        } else if (isNabi) {
            bw.write("nabi");
        } else if (isYeongcheol) {
            bw.write("yeongcheol");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30402().solution();
    }
}
