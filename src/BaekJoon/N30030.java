package BaekJoon;

import java.io.*;

//스위트콘 가격 구하기
public class N30030 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double price = Double.parseDouble(br.readLine());
        price = price * ((double) 10 / 11);

        bw.write((int)price + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30030().solution();
    }
}
