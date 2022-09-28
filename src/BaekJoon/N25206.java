package BaekJoon;

import java.io.*;

//너의 평점은
public class N25206 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] chihoonInfo = new String[20][3];
        double sumScore = 0.0;  //전공과목별 (학점*과목평점)의 합이 담길 변수
        double count = 0.0; //학점의 총합을 담을 변수

        for(int i = 0; i < 20; i++){
            chihoonInfo[i] = br.readLine().split(" ");  //주어진 입력을 과목명,학점,등급 순으로 1차 배열이 가리키는 2차배열에 저장하도록 함
            double temp = Double.parseDouble(chihoonInfo[i][1]);    //학점

            if(!chihoonInfo[i][2].equals("P")){ //등급이 "P"인 경우가 아니라면
                count += temp;  //학점을 카운트 변수에 더하고
                sumScore += temp * changeToScore(chihoonInfo[i][2]);    //총점은 등급에 해당하는 평점*학점을 더하여 준다.
            }
        }

        String score = String.format("%.6f", sumScore/count);   //소수점 6자리까지 나타내도록 하며 String으로 변환

        bw.write(score);

        br.close();
        bw.flush();
        bw.close();

    }

    double changeToScore(String grade){ //등급 -> 과목평점 변환
        double score = 0;

        switch (grade){
            case "A+" :
                score = 4.5;
                break;
            case "A0" :
                score = 4.0;
                break;
            case "B+" :
                score = 3.5;
                break;
            case "B0" :
                score = 3.0;
                break;
            case "C+" :
                score = 2.5;
                break;
            case "C0" :
                score = 2.0;
                break;
            case "D+" :
                score = 1.5;
                break;
            case "D0" :
                score = 1.0;
                break;
            case "F" :
                score = 0.0;
                break;
        }

        return score;
    }

    public static void main(String[] args) throws IOException{
        new N25206().solution();
    }
}
