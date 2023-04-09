package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//최댓값
public class N2566 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int targetRow = 0, targetColumn = 0, max = 0;

        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= 9; j++) {
                int number = Integer.parseInt(st.nextToken());

                if (max <= number) {
                    max = number;
                    targetRow = i;
                    targetColumn = j;
                }
            }
        }

        bw.write(max + "\n" + targetRow + " " + targetColumn);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2566().solution();
    }
}
