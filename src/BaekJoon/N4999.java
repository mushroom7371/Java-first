package BaekJoon;

import java.io.*;

//아!
public class N4999 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String jaeHwanAah = br.readLine();
        String doctorAah = br.readLine();

        if (doctorAah.length() <= jaeHwanAah.length()) {
            bw.write("go");
        } else {
            bw.write("no");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4999().solution();
    }
}
