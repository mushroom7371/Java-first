package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//HOMWRK
public class N18398 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int numberOfProblems = Integer.parseInt(br.readLine());

            for (int i = 0; i < numberOfProblems; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int sum = 0;
                int multiply = 1;

                while (st.hasMoreTokens()) {
                    int number = Integer.parseInt(st.nextToken());
                    sum += number;
                    multiply *= number;
                }

                bw.write(sum + " " + multiply + "\n");
            }
        }


        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N18398().solution();
    }
}
