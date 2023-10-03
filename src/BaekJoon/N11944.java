package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//NN
public class N11944 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int numberOfN = Integer.parseInt(N);
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfN; i++) {
            sb.append(N);
            if (sb.length() >= M) {
                break;
            }
        }

        if (sb.length() > M) {
            bw.write(sb.substring(0, M));
        } else {
            bw.write(sb.toString());
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11944().solution();
    }
}
