package BaekJoon;

import java.io.*;

//短針 (Hour Hand)
public class N24083 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        for (int i = 0; i < b; i++) {
            a++;
            if (a > 12) {
                a = 1;
            }
        }

        bw.write(a + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N24083().solution();
    }
}
