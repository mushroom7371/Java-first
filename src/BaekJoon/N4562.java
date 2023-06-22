package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//No Brainer
public class N4562 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine());
            int numberOfBrains = Integer.parseInt(st.nextToken());
            int requiredBrains = Integer.parseInt(st.nextToken());

            if (numberOfBrains >= requiredBrains) {
                bw.write("MMM BRAINS\n");
            } else {
                bw.write("NO BRAINS\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4562().solution();
    }
}
