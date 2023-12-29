package BaekJoon;

import java.io.*;
import java.util.Arrays;

//나의 학점은?
public class N17826 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] score = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(br.readLine());
        int rank = 0;

        for (int i = 0; i < score.length; i++) {
            rank++;
            if (score[i] == target) {
                break;
            }
        }

        if (rank <= 5) {
            bw.write("A+");
        } else if (rank <= 15) {
            bw.write("A0");
        } else if (rank <= 30) {
            bw.write("B+");
        } else if (rank <= 35) {
            bw.write("B0");
        } else if (rank <= 45) {
            bw.write("C+");
        } else if (rank <= 48) {
            bw.write("C0");
        } else {
            bw.write("F");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17826().solution();
    }
}
