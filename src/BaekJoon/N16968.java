package BaekJoon;

import java.io.*;

//차량 번호판1
public class N16968 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String carNumberType = br.readLine();

        int count = 1;
        for (int i = 0; i < carNumberType.length(); i++) {
            char c = carNumberType.charAt(i);
            if (i == 0) {
                if (c == 'c') {
                    count *= 26;
                } else {
                    count *= 10;
                }
            } else {
                if (c == 'c') {
                    if (carNumberType.charAt(i-1) == 'c') {
                        count *= 25;
                    } else {
                        count *= 26;
                    }
                } else {
                    if (carNumberType.charAt(i-1) == 'd') {
                        count *= 9;
                    } else {
                        count *= 10;
                    }
                }
            }
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16968().solution();
    }
}
