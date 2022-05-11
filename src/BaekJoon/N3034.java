package BaekJoon;

import java.io.*;

//앵그리 창영
public class N3034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] boxAndMatchInfo = br.readLine().split(" ");
        int numberOfMatch = Integer.parseInt(boxAndMatchInfo[0]);
        int boxWidth = Integer.parseInt(boxAndMatchInfo[1]);
        int boxHeight = Integer.parseInt(boxAndMatchInfo[2]);
        double boxDiagonal = Math.sqrt(boxWidth*boxWidth + boxHeight*boxHeight);    //박스의 대각선 길이를 구하기 위한 연산
        int matchLength = 0;

        for(int i = 0; i < numberOfMatch; i++){
            matchLength = Integer.parseInt(br.readLine());
            if(matchLength <= boxDiagonal){
                bw.write("DA" + "\n");
            }else{
                bw.write("NE" + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
