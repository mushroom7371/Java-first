package BaekJoon;

import java.io.*;

//별 찍기 - 13
public class N2523 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine())*2 - 1;
        String[] starArray = new String[size];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size/2 + 1; i++) {
            sb.append("*");

            starArray[i] = String.valueOf(sb);
            starArray[size-1-i] = String.valueOf(sb);
        }

        for (int i = 0; i < starArray.length; i++) {
            bw.write(starArray[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2523().solution();
    }
}
