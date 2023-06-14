package BaekJoon;

import java.io.*;

//Next in line
public class N6749 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = second + (second - first);

        bw.write(third + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6749().solution();
    }
}
