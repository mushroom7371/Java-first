package BaekJoon;

import java.io.*;

//이번학기 평점은 몇점?
public class N2755 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        double sumScore = 0.0;  //전공과목별 (학점*과목평점)의 합이 담길 변수
        double gradeCount = 0.0; //학점의 총합을 담을 변수

        for(int i = 0; i < testCase; i++){
            String[] gradeInfoArray = br.readLine().split(" ");
            double tempGradeCount = Double.parseDouble(gradeInfoArray[1]);
            gradeCount += tempGradeCount;

            sumScore += tempGradeCount * changeToScore(gradeInfoArray[2]);
        }

        String score = String.format("%.2f", sumScore/gradeCount);
        bw.write(score);

        br.close();
        bw.flush();
        bw.close();
    }

    double changeToScore(String grade){ //등급 -> 과목평점 변환
        double score = 0;

        switch (grade){
            case "A+" :
                score = 4.3;
                break;
            case "A0" :
                score = 4.0;
                break;
            case "A-" :
                score = 3.7;
                break;
            case "B+" :
                score = 3.3;
                break;
            case "B0" :
                score = 3.0;
                break;
            case "B-" :
                score = 2.7;
                break;
            case "C+" :
                score = 2.3;
                break;
            case "C0" :
                score = 2.0;
                break;
            case "C-" :
                score = 1.7;
                break;
            case "D+" :
                score = 1.3;
                break;
            case "D0" :
                score = 1.0;
                break;
            case "D-" :
                score = 0.7;
                break;
            case "F" :
                score = 0.0;
                break;
        }

        return score;
    }


    public static void main(String[] args) throws IOException{
        new N2755().solution();
    }
}
