package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//카드 게임 (Easy)
public class N32141 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int[] d = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (h > 0) {
                cnt++;
                h -= d[i];
            } else {
                break;
            }
        }

        if (h > 0) {
            cnt = -1;
        }

        bw.write(cnt + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32141().solution();
    }
}
