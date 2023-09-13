package BaekJoon;

import java.io.*;

//오각형, 오각형, 오각형…
public class N1964 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int target = Integer.parseInt(br.readLine());
        long[] result = new long[target];
        result[0] = 5;

        for (int i = 1; i < target; i++) {
            result[i] = (result[i - 1] + 3 * i + 4) % 45678;
        }

        bw.write(String.valueOf(result[target - 1]));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1964().solution();
    }
}
