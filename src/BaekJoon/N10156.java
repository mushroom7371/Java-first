package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//과자
public class N10156 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int price = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        int result = price * count - money;
        bw.write(result > 0 ? result + "" : "0");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10156().solution();
    }
}
