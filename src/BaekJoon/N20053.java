package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//최소, 최대2
public class N20053 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int numberOfIntegers = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = 1000000;
            int max = -1000000;

            for(int i = 0; i < numberOfIntegers; i++){
                int number = Integer.parseInt(st.nextToken());

                if (number <= min) {
                    min = number;
                }

                if (number >= max) {
                    max = number;
                }
            }

            bw.write(min + " " + max + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N20053().solution();
    }
}
