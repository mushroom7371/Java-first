package BaekJoon;

import java.io.*;

//이제는 더 이상 물러날 곳이 없다
public class N30455 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        if (n % 2 == 1) {
            bw.write("Goose");
        } else {
            bw.write("Duck");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30455().solution();
    }
}
