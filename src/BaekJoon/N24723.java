package BaekJoon;

import java.io.*;

//녹색거탑
public class N24723 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int heightOfTower = Integer.parseInt(br.readLine());
        int result = 1;

        for (int i = 0; i < heightOfTower; i++) {
             result *= 2;
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N24723().solution();
    }
}
