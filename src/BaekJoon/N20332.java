package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Divvying Up
public class N20332 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfContest = Integer.parseInt(br.readLine());

        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numberOfContest; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        if (sum % 3 == 0) {
            bw.write("yes");
        } else {
            bw.write("no");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N20332().solution();
    }
}
