package BaekJoon;

import java.io.*;

//특별한 날
public class N10768 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        if (month == 1) {
            bw.write("Before");
        } else if (month == 2) {
            if (day < 18) {
                bw.write("Before");
            } else if (day == 18) {
                bw.write("Special");
            } else {
                bw.write("After");
            }
        } else {
            bw.write("After");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10768().solution();
    }
}
