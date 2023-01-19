package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//분수좋아해?
public class N10474 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while (!(input = br.readLine()).equals("0 0")) {
            StringTokenizer st = new StringTokenizer(input);
            int numerator = Integer.parseInt(st.nextToken());
            int denominator = Integer.parseInt(st.nextToken());

            bw.write(numerator/denominator + " " + numerator%denominator + " / " + denominator + "\n");

        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10474().solution();
    }
}
