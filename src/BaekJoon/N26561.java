package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Population
public class N26561 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int people = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            for (int i = 1; i <= second; i++) {
                if (i % 7 == 0) {
                    people--;
                }
                if (i % 4 == 0) {
                    people++;
                }
            }

            bw.write(people + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N26561().solution();
    }
}
