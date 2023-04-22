package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//캥거루
public class N2965 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());
        int countA = second - first;
        int countB = third - second;

        if (countA >= countB) {
            bw.write(countA - 1 + "");
        } else {
            bw.write(countB - 1 + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2965().solution();
    }
}
