package BaekJoon;

import java.io.*;

//덩치
public class N7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfPeople = Integer.parseInt(br.readLine());   //덩치 순위를 구할 인원수
        int [][] heightAndWeight = new int[numberOfPeople][2];  //인원별 키와 몸무게를 담을 2차원 배열 생성
        String [] ArrayForInputSplit;   //주어진 입력을 공백으로 나눠 담을 String 배열
        int buildCount = 1; //덩치 순위, 0순위는 없으므로 1로 초기화(가장 큰 덩치는 1등이다)

        for(int i = 0; i < numberOfPeople; i++){    //입력을 공백을 기준으로 자르고 숫자로 변환하여 각 인원별 키,몸무게로 세팅
            ArrayForInputSplit = br.readLine().split(" ");
            heightAndWeight[i][0] = Integer.parseInt(ArrayForInputSplit[0]);
            heightAndWeight[i][1] = Integer.parseInt(ArrayForInputSplit[1]);
        }

        br.close();

        for(int i = 0; i < numberOfPeople; i++){    //2중 배열을 통해 부르트포스를 실시한다.
            for(int j = 0; j < numberOfPeople; j++){
                //i학생을 기준으로 모든 인원에 대한 검사를 하며, 몸무게와 키가 i학생 보다 크다면 덩치 순위가 1증가한다.
                if(heightAndWeight[i][0] < heightAndWeight[j][0] && heightAndWeight[i][1] < heightAndWeight[j][1]){
                    buildCount++;
                }
            }
            bw.write(buildCount + "" + "\n");   //버퍼에 기록
            buildCount = 1; //순위를 다시 1로 재설정 해준다
        }

        bw.flush();
        bw.close();

    }
}
