package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//피로도
public class N22864 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int result = 0;
        int fatigue = 0;
        for (int i = 1; i <= 24; i++) {
            if (fatigue + A <= M) {
                fatigue += A;
                result += B;
            } else {
                fatigue -= C;
                if (fatigue < 0) {
                    fatigue = 0;
                }
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N22864().solution();
    }
}
