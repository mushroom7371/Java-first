package BaekJoon;

import java.io.*;

//UCPC에서 가장 쉬운 문제 번호는?
public class N25311 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String year = br.readLine();
        bw.write("A");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25311().solution();
    }
}
