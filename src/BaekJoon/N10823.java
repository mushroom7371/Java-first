package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//더하기 2
public class N10823 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String input = "";

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            sb.append(input);
        }

        StringTokenizer st = new StringTokenizer(String.valueOf(sb), ",");

        int sum = 0;
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10823().solution();
    }
}
