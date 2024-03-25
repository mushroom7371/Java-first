package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//SASA 모형을 만들어보자
public class N23825 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long numberOfS = Long.parseLong(st.nextToken());
        long numberOfA = Long.parseLong(st.nextToken());

        long result = Math.min(numberOfS / 2, numberOfA / 2);

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23825().solution();
    }
}
