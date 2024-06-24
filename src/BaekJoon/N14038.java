package BaekJoon;

import java.io.*;
import java.util.Map;

//Tournament Selection
public class N14038 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        Map<Integer, String> result = Map.of(
                6, "1",
                5, "1",
                4, "2",
                3, "2",
                2, "3",
                1, "3",
                0, "-1"
        );

        for (int i = 0; i < 6; i++) {
            if (br.readLine().equals("W")) {
                count++;
            }
        }

        bw.write(result.get(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14038().solution();
    }
}
