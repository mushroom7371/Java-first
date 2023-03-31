package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//사분면
public class N9610 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0;

        while (testCase -- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x == 0 || y == 0) {
                axis++;
            } else if (x > 0 && y > 0) {
                q1++;
            } else if (x > 0 && y < 0) {
                q4++;
            } else if (x < 0 && y >0) {
                q2++;
            } else if (x < 0 && y < 0) {
                q3++;
            }
        }

        bw.write("Q1: " + q1 +"\nQ2: " + q2 +"\nQ3: " + q3 + "\nQ4: " + q4 + "\nAXIS: " + axis);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9610().solution();
    }
}
