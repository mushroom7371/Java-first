package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//추첨상 사수 대작전! (Easy)
public class N20410 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int seed = Integer.parseInt(st.nextToken());
        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int a = 0;
        int c = 0;
        boolean isFound = false;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < m; j++) {
                if (x1 == getRandom(i, seed, j, m) && x2 == getRandom(i, x1, j, m)) {
                    isFound = true;
                    a = i;
                    c = j;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }

        bw.write(a + " " + c);

        br.close();
        bw.flush();
        bw.close();
    }

    int getRandom(int a, int seed, int c, int m) {
        return (a * seed + c) % m;
    }

    public static void main(String[] args) throws IOException {
        new N20410().solution();
    }
}
