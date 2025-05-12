package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//방배정
public class N13304 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfStudents = Integer.parseInt(st.nextToken());
        int maxCount = Integer.parseInt(st.nextToken());
        int boyAndGirlcountInGrade1And2 = 0;
        int boyCountInGrade3And4 = 0;
        int girlCountInGrade3And4 = 0;
        int boyCountInGrade5And6 = 0;
        int girlCountInGrade5And6 = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            st = new StringTokenizer(br.readLine());
            String sex = st.nextToken();
            String grade = st.nextToken();

            if (grade.equals("1") || grade.equals("2")) {
                boyAndGirlcountInGrade1And2++;
            } else if (grade.equals("3") || grade.equals("4")) {
                if (sex.equals("1")) {
                    boyCountInGrade3And4++;
                } else {
                    girlCountInGrade3And4++;
                }
            } else {
                if (sex.equals("1")) {
                    boyCountInGrade5And6++;
                } else {
                    girlCountInGrade5And6++;
                }
            }
        }

        int roomCount = 0;

        if (boyAndGirlcountInGrade1And2 > 0) {
            roomCount += boyAndGirlcountInGrade1And2 / maxCount;
            if (boyAndGirlcountInGrade1And2 % maxCount != 0) {
                roomCount++;
            }
        }

        if (boyCountInGrade3And4 > 0) {
            roomCount += boyCountInGrade3And4 / maxCount;
            if (boyCountInGrade3And4 % maxCount != 0) {
                roomCount++;
            }
        }

        if (girlCountInGrade3And4 > 0) {
            roomCount += girlCountInGrade3And4 / maxCount;
            if (girlCountInGrade3And4 % maxCount != 0) {
                roomCount++;
            }
        }

        if (boyCountInGrade5And6 > 0) {
            roomCount += boyCountInGrade5And6 / maxCount;
            if (boyCountInGrade5And6 % maxCount != 0) {
                roomCount++;
            }
        }

        if (girlCountInGrade5And6 > 0) {
            roomCount += girlCountInGrade5And6 / maxCount;
            if (girlCountInGrade5And6 % maxCount != 0) {
                roomCount++;
            }
        }

        bw.write(roomCount + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13304().solution();
    }
}
