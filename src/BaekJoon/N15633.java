package BaekJoon;

import java.io.*;

//Fan Death
public class N15633 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int target = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= target; i++) {
            if (target % i == 0) {
                result += i;
            }
        }

        bw.write(String.valueOf(result * 5 - 24));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15633().solution();
    }
}
