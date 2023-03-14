package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//미아 노트
public class N20114 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int strLength = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        String [] result = new String[strLength];

        for (int i = 0; i < result.length; i++) {
            result[i] = "?";
        }

        for (int i = 0; i < H; i++) {
            String [] input = br.readLine().split("");

            for (int j = 0; j < input.length; j += W) {
                for (int k = j; k < j + W; k++) {
                    if (!input[k].equals("?")) {
                        result[j/W] = input[k];
                    }
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            bw.write(result[i]);
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N20114().solution();
    }
}
