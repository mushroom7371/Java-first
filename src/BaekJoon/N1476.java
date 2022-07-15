package BaekJoon;

import java.io.*;
import java.util.Arrays;

//날짜 계산
public class N1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] dateInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();    //준규가 사는 나라의 날짜정보
        int [] initDate = {1, 1, 1};    //우리나라의 1년은 준규네 나라의 1E 1S 1M 이며 초기 설정을 위해 배열 생성 후 데이터 초기화
        int earth = dateInfo[0];    //주어진 준규네 나라 E
        int sun = dateInfo[1];  //주어진 준규네 나라 S
        int moon = dateInfo[2]; //주어진 준규네 나라 M

        int year = 1;   //우리가 살고있는 나라의 초기 년도

        while(true){
            if(earth == initDate[0] && sun == initDate[1] && moon == initDate[2]) break;    //주어진 준규네 나라의 날짜 정보와 일치하면 반복 종료

            year++; //년도를 증가
            initDate[0]++;  //E를 증가
            initDate[1]++;  //S를 증가
            initDate[2]++;  //M을 증가

            if(initDate[0] > 15) initDate[0] = 1;   //범위인 15를 넘으면 1로 설정
            if(initDate[1] > 28) initDate[1] = 1;   //범위인 28을 넘으면 1로 설정
            if(initDate[2] > 19) initDate[2] = 1;   //범위인 19를 넘으면 1로 설정

        }

        br.close();
        bw.write(year + "");
        bw.flush();
        bw.close();

    }
}
