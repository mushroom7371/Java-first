package BaekJoon;

import java.io.*;

//수학은 체육과목 입니다 2
public class N17362 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());

        if (number % 8 == 1) {
            bw.write("1");
        } else if (number % 8 == 2 || number % 8 == 0) {
            bw.write("2");
        } else if (number % 8 == 3 || number % 8 == 7) {
            bw.write("3");
        } else if (number % 8 == 4 || number % 8 == 6) {
            bw.write("4");
        } else if (number % 8 == 5) {
            bw.write("5");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17362().solution();
    }
}
