package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//이교수님의 시험
public class N10874 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfStudent = Integer.parseInt(br.readLine());

        for (int i = 1; i <= numberOfStudent; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean isReExam = true;

            for (int j = 1; j <= 10; j++) {
                int studentAnswer = Integer.parseInt(st.nextToken());
                int answer = (j - 1) % 5 + 1;

                if (studentAnswer != answer) {
                    isReExam = false;
                    break;
                }
            }

            if (isReExam) {
                bw.write(i + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10874().solution();
    }
}
