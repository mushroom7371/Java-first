package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//나이 계산하기
public class N16199 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int birthYear = Integer.parseInt(st.nextToken());
        int birthMonth = Integer.parseInt(st.nextToken());
        int birthDay = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int currentYear = Integer.parseInt(st.nextToken());
        int currentMonth = Integer.parseInt(st.nextToken());
        int currentDay = Integer.parseInt(st.nextToken());

        int age = currentYear - birthYear;

        if (birthYear == currentYear) {
            bw.write(age + "\n");
        } else {
            if (birthMonth > currentMonth) {
                bw.write((age - 1) + "\n");
            } else if (birthMonth == currentMonth) {
                if (birthDay <= currentDay) {
                    bw.write(age + "\n");
                } else {
                    bw.write((age - 1) + "\n");
                }
            } else {
                bw.write(age + "\n");
            }
        }

        bw.write((age + 1) + "\n");
        bw.write(age + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16199().solution();
    }
}
