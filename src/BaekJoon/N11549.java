package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Identifying tea
public class N11549 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String answer = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        while (st.hasMoreTokens()) {
            if (answer.equals(st.nextToken())) {
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11549().solution();
    }
}
