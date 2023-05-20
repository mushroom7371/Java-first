package BaekJoon;

import java.io.*;

//Hello Judge
public class N9316 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        String result = "Hello World, Judge ";

        for (int i = 1; i <= testCase; i++) {
            bw.write(result + i + "!\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9316().solution();
    }
}
