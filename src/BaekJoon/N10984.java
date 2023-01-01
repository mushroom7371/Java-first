package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//내 학점을 구해줘
public class N10984 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase -- > 0){
            int N = Integer.parseInt(br.readLine());
            int sumGrade = 0;
            double sumGPA = 0;

            while(N -- > 0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int grade = Integer.parseInt(st.nextToken());
                double GPA = Double.parseDouble(st.nextToken());

                sumGrade += grade;
                sumGPA += grade * GPA;
            }

            bw.write(sumGrade + " " + String.format("%.1f", sumGPA/sumGrade) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N10984().solution();
    }
}
