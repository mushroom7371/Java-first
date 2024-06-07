package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//준영이의 등급
public class N30008 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfStudents = Integer.parseInt(st.nextToken());
        int numberOfSubject = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numberOfSubject; i++) {
            int subject = Integer.parseInt(st.nextToken());
            int score = subject * 100 / numberOfStudents;

            bw.write((grade(score)) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    int grade(int subject) {
        if (subject >= 0 && subject <= 4) {
            return 1;
        } else if (subject > 4 && subject <= 11) {
            return 2;
        } else if (subject > 11 && subject <= 23) {
            return 3;
        } else if (subject > 23 && subject <= 40) {
            return 4;
        } else if (subject > 40 && subject <= 60) {
            return 5;
        } else if (subject > 60 && subject <= 77) {
            return 6;
        } else if (subject > 77 && subject <= 89) {
            return 7;
        } else if (subject > 89 && subject <= 96) {
            return 8;
        }
        return 9;
    }

    public static void main(String[] args) throws IOException {
        new N30008().solution();
    }
}
