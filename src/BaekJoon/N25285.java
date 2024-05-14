package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//심준의 병역판정검사
public class N25285 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfPeople = Integer.parseInt(br.readLine());

        while (numberOfPeople --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double height = Integer.parseInt(st.nextToken());
            double weight = Integer.parseInt(st.nextToken());
            double bmi = weight / Math.pow(height / 100.0, 2);

            if (height < 140.1) {
                bw.write("6");
            } else if (height < 146) {
                bw.write("5");
            } else if (height < 159) {
                bw.write("4");
            } else if (height < 161) {
                if (bmi >= 16.0 && bmi < 35.0) {
                    bw.write("3");
                } else {
                    bw.write("4");
                }
            } else if (height < 204) {
                if (bmi >= 20.0 && bmi < 25.0) {
                    bw.write("1");
                } else if (bmi >= 18.5 && bmi < 20.0 || bmi >= 25.0 && bmi < 30.0) {
                    bw.write("2");
                } else if (bmi >= 16.0 && bmi < 18.5 || bmi >= 30.0 && bmi < 35.0) {
                    bw.write("3");
                } else {
                    bw.write("4");
                }
            } else {
                bw.write("4");
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25285().solution();
    }
}
