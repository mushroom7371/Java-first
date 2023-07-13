package BaekJoon;

import java.io.*;

//3의 배수
public class N16561 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int target = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 3; i < target; i += 3) {
            for (int j = 3; j < target; j += 3) {
                int k = target - i - j;
                if (k % 3 == 0 && k > 0) {
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16561().solution();
    }
}
