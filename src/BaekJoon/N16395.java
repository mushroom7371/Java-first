package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//파스칼의 삼각형
public class N16395 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int targetN = Integer.parseInt(st.nextToken()); //n행
        int targetK = Integer.parseInt(st.nextToken()); //k번째 수
        int [] targetArray = {1, 1};    //초기 배열

        for(int i = 3; i <= targetN; i++){  //i는 3부터 n행 까지 반복 n이 3미만 이면 건너뜀
            int [] tempArray = new int[i];  //i를 크기로 가지는 임시 배열 선언
            tempArray[0] = 1;   //첫항은 1로 고정
            tempArray[tempArray.length - 1] = 1;    //마지막 항도 1로 고정

            for(int j  = 1; j < tempArray.length-1; j++){   //두번재 항부터 마지막 전항까지
                tempArray[j] = targetArray[j-1] + targetArray[j];
                //targetArray는 이전 행에 대한 정보를 가진 배열을 가리키고, tempArray의 j번째 수는 이전 행의 j-1,j번째 수를 더한 값과 같다
            }

            targetArray = tempArray;    //목표 행의 정보를 가진 배열을 targetArray가 가리키도록 설정
        }

        br.close();
        bw.write(targetArray[targetK - 1] + "");
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16395().solution();
    }
}
