package BaekJoon;

import java.io.*;

//파인만
public class N5724 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                break;
            }

            int result = 0;
            for (int i = 1; i <= input; i++) {
                result += i * i;
            }

            bw.write(String.valueOf(result));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5724().solution();
    }
}
