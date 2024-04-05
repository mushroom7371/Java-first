package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//레몬 따기
public class N28061 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfTree = Integer.parseInt(br.readLine());
        int[] trees = new int[numberOfTree];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numberOfTree; i++) {
            trees[i] = Integer.parseInt(st.nextToken()) - (numberOfTree - i);
        }

        int max = 0;
        for (int i = 0; i < numberOfTree; i++) {
            if (trees[i] > max) {
                max = trees[i];
            }
        }

        bw.write(max + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28061().solution();
    }
}
