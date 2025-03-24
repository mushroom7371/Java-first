package BaekJoon;

import java.io.*;

//인간은 무엇인가
public class N32651 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        if (n % 2024 == 0 && n <= 100000) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32651().solution();
    }
}
