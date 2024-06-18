package BaekJoon;

import java.io.*;

//연세대학교
public class N15680 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String flag = br.readLine();

        if (flag.equals("0")) {
            bw.write("YONSEI");
        } else {
            bw.write("Leading the Way to the Future");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15680().solution();
    }
}
