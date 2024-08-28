package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Reverse
public class N26546 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int startIndex = Integer.parseInt(st.nextToken());
            int endIndex = Integer.parseInt(st.nextToken());
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                if (i < startIndex || i >= endIndex) {
                    result.append(str.charAt(i));
                }
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N26546().solution();
    }
}
