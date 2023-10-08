package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Report Card Time
public class N11367 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfStudent = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfStudent; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String grade = changeGrade(Integer.parseInt(st.nextToken()));

            bw.write(name + " " + grade + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    String changeGrade(int score) {
        if (score >= 97) {
            return "A+";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 87) {
            return "B+";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 77) {
            return "C+";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 67) {
            return "D+";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) throws IOException {
        new N11367().solution();
    }
}
