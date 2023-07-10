package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//방 배정
public class N13300 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfStudent = Integer.parseInt(st.nextToken());
        int maxNumberOfStudent = Integer.parseInt(st.nextToken());
        int[] girlStudentInfo = new int[7];
        int[] boyStudentInfo = new int[7];

        for (int i = 0; i < numberOfStudent; i++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());

            if (sex == 0) {
                girlStudentInfo[grade]++;
            } else {
                boyStudentInfo[grade]++;
            }
        }

        int numberOfRoom = 0;
        for (int i = 1; i < 7; i++) {
            numberOfRoom += Math.ceil((double)girlStudentInfo[i]/maxNumberOfStudent);
            numberOfRoom += Math.ceil((double)boyStudentInfo[i]/maxNumberOfStudent);
        }

        bw.write(numberOfRoom + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13300().solution();
    }
}
