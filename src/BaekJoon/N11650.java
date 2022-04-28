package BaekJoon;

import java.io.*;
import java.util.Arrays;

//좌표 정렬하기
public class N11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());    //케이스 개수
        int [][] numArr = new int[N][2];    //비교를 위한 2차원 배열 선언
        String [] strNum;   //BufferedReader로 받은 입력을 나눠 담을 참조변수 선언

        for(int i = 0; i < N; i++){
            strNum = br.readLine().split(" ");  //공백을 기준으로 나누고
            numArr[i][0] = Integer.parseInt(strNum[0]); //2차원 배열의 각 번지에 담아둔다.
            numArr[i][1] = Integer.parseInt(strNum[1]);
        }

        br.close();

        //Comparator 인터페이스를 구현하여 재정의한 compare()를 기준으로 하여 정렬
        //람다식을 통한 익명함수 사용으로 위의 내용이 간소화 되었다
        Arrays.sort(numArr, (o1, o2) -> {
            if(o1[0] == o2[0]){ //1차원에 해당하는 번지의 데이터가 같다면
                return o1[1] - o2[1];   //2차원에 해당하는 값을 비교하여 오름차순이 되도록 정렬
            }else{
                return o1[0] - o2[0];   //1차원에 해당하는 번지의 데이터를 오름차순으로 정렬
            }
        });

        for(int i = 0; i < N; i++){
            bw.write(numArr[i][0] + " " + numArr[i][1] + "\n");
        }

        bw.flush();
        bw.close();

    }
}
