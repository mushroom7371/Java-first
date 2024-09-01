package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//욱제는 건축왕이야!!
public class N15923 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfPoint = Integer.parseInt(br.readLine());
        int[][] points = new int[numberOfPoint][2];

        for (int i = 0; i < numberOfPoint; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for (int i = 0; i < numberOfPoint - 1; i++) {
            result += Math.abs(points[i][0] - points[i + 1][0]) + Math.abs(points[i][1] - points[i + 1][1]);
        }
        result += Math.abs(points[numberOfPoint - 1][0] - points[0][0]) + Math.abs(points[numberOfPoint - 1][1] - points[0][1]);

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15923().solution();
    }
}
