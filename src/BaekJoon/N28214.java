package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//크림빵
public class N28214 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String[][] creamInfo = new String[n][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                creamInfo[i][j] = st.nextToken();
            }
        }

        int sellCount = 0;
        for (int i = 0; i < n; i++) {
            int creamCount = 0;
            for (int j = 0; j < k; j++) {
                if (creamInfo[i][j].equals("1")) {
                    creamCount++;
                }
            }
            if (creamCount >= p) {
                sellCount++;
            }
        }

        bw.write(sellCount + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28214().solution();
    }
}
