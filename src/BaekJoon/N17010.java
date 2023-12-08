package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Time to Decompress
public class N17010 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String character = st.nextToken();

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < repeat; i++) {
                result.append(character);
            }

            bw.write(result.toString() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17010().solution();
    }
}
