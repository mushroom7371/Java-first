package BaekJoon;

import java.io.*;

//과제 안 내신 분..?
public class N5597 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] students = new int[31];

        for (int i = 1; i < 29; i++) {
            int index = Integer.parseInt(br.readLine());
            students[index]++;
        }

        for (int i = 1; i < 31; i++) {
            if (students[i] == 0) {
                bw.write(i + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5597().solution();
    }
}
