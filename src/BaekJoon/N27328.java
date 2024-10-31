package BaekJoon;

import java.io.*;

//三方比較 (Three-Way Comparison)
public class N27328 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (a > b) {
            bw.write("1");
        } else if (a == b) {
            bw.write("0");
        } else {
            bw.write("-1");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27328().solution();
    }
}
