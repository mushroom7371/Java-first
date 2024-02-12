package BaekJoon;

import java.io.*;
import java.util.Date;

//오늘 날짜
public class N10699 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Date currentDate = new Date();

        bw.write(String.format("%tF", currentDate));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10699().solution();
    }
}
