package BaekJoon;

import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;

//상금 헌터
public class N15953 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Map<Integer, Integer> first = Map.of(
                1, 5000000,
                2, 3000000,
                3, 2000000,
                4, 500000,
                5, 300000,
                6, 100000
        );

        Map<Integer, Integer> second = Map.of(
                1, 5120000,
                2, 2560000,
                3, 1280000,
                4, 640000,
                5, 320000
        );

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstRank = Integer.parseInt(st.nextToken());
            int secondRank = Integer.parseInt(st.nextToken());
            int result = 0;

            if (firstRank != 0) {
                for (int i = 1; i <= 6; i++) {
                    if (firstRank <= i * (i + 1) / 2) {
                        result += first.get(i);
                        break;
                    }
                }
            }

            if (secondRank != 0) {
                for (int i = 1; i <= 5; i++) {
                    if (secondRank <= Math.pow(2, i) - 1) {
                        result += second.get(i);
                        break;
                    }
                }
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15953().solution();
    }
}
