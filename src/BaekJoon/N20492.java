package BaekJoon;

import java.io.*;

//세금
public class N20492 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int money = Integer.parseInt(br.readLine());
        double resultA = money * 0.78;
        double resultB = money * 0.8 + (money * 0.2 * 0.78);

        bw.write((int)resultA + " " + (int)resultB);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N20492().solution();
    }
}
