package BaekJoon;

import java.io.*;

//딱지놀이
public class N14696 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int[] a = new int[5];
            int[] b = new int[5];
            String[] inputA = br.readLine().split(" ");
            String[] inputB = br.readLine().split(" ");

            for (int i = 1; i < inputA.length; i++) {
                a[Integer.parseInt(inputA[i])] += 1;
            }
            for (int i = 1; i < inputB.length; i++) {
                b[Integer.parseInt(inputB[i])] += 1;
            }

            if (a[4] != b[4]) {
                bw.write((a[4] > b[4] ? "A\n" : "B\n"));
                continue;
            }

            if (a[3] != b[3]) {
                bw.write((a[3] > b[3] ? "A\n" : "B\n"));
                continue;
            }

            if (a[2] != b[2]) {
                bw.write((a[2] > b[2] ? "A\n" : "B\n"));
                continue;
            }

            if (a[1] != b[1]) {
                bw.write((a[1] > b[1] ? "A\n" : "B\n"));
                continue;
            }

            bw.write("D\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14696().solution();
    }
}
