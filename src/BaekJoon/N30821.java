package BaekJoon;

import java.io.*;

//별자리가 될 수 있다면
public class N30821 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long count = 1;

        for (int i = 0; i < 5; i++) {
            count *= n - i;
        }

        for (int i = 0; i < 5; i++) {
            count /= (i + 1);
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30821().solution();
    }
}
