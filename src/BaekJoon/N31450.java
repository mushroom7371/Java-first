package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Everyone is a winner
public class N31450 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfMedals = Integer.parseInt(st.nextToken());
        int numberOfKids = Integer.parseInt(st.nextToken());

        if (numberOfMedals % numberOfKids == 0) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31450().solution();
    }
}
