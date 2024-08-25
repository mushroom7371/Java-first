package BaekJoon;

import java.io.*;

//정보보호학부 동아리 소개
public class N28691 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        if (input.equals("M")) {
            bw.write("MatKor");
        } else if (input.equals("W")) {
            bw.write("WiCys");
        } else if (input.equals("C")) {
            bw.write("CyKor");
        } else if (input.equals("A")) {
            bw.write("AlKor");
        } else {
            bw.write("$clear");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28691().solution();
    }
}
