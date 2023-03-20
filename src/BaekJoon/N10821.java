package BaekJoon;

import java.io.*;

//정수의 개수
public class N10821 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] afterSplitArray = br.readLine().split(",");

        bw.write(afterSplitArray.length + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10821().solution();
    }
}
