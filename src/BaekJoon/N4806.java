package BaekJoon;

import java.io.*;

//줄세기
public class N4806 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        int count = 0;

        while ((input = br.readLine()) != null) {
            count++;
        }

        bw.write(count + "");

        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4806().solution();
    }
}
