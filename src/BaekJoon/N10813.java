package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//공 바꾸기
public class N10813 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfBall = Integer.parseInt(st.nextToken());
        int timesOfChange = Integer.parseInt(st.nextToken());
        int [] ballArray = new int[numberOfBall];

        for (int i = 0; i < numberOfBall; i++) {
            ballArray[i] = i+1;
        }

        for (int i = 0; i < timesOfChange; i++) {
            st = new StringTokenizer(br.readLine());
            int changeIndexA = Integer.parseInt(st.nextToken()) - 1;
            int changeIndexB = Integer.parseInt(st.nextToken()) - 1;

            int temp = ballArray[changeIndexA];
            ballArray[changeIndexA] = ballArray[changeIndexB];
            ballArray[changeIndexB] = temp;
        }

        for (int i = 0; i < numberOfBall; i++) {
            bw.write(ballArray[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10813().solution();
    }
}
