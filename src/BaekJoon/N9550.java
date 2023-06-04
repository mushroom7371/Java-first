package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//아이들은 사탕을 좋아해
public class N9550 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine());
            int kindOfCandy = Integer.parseInt(st.nextToken());
            int numberOfCandyForHappy = Integer.parseInt(st.nextToken());
            int result = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < kindOfCandy; i++) {
                int numberOfCandy = Integer.parseInt(st.nextToken());

                result += numberOfCandy/numberOfCandyForHappy;
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9550().solution();
    }
}
