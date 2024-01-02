package BaekJoon;

import java.io.*;

//원피스
public class N12780 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String h = br.readLine();
        String n = br.readLine();

        int count = 0;
        for (int i = 0; i < h.length() - n.length() + 1; i++) {
            if (h.substring(i, i + n.length()).equals(n)) {
                count++;
            }
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N12780().solution();
    }
}
