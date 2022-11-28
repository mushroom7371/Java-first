package BaekJoon;

import java.io.*;

//키 큰 사람
public class N11292 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase;

        while((testCase = Integer.parseInt(br.readLine())) != 0){   //입력으로 0이 들어오면 종료
            String[][] peopleInfo = new String[testCase][]; //이름과 키를 담을 2차원배열을 선언
            Double max = 0.0;   //키의 최대값을 저장할 변수

            for(int i = 0; i < testCase; i++){
                peopleInfo[i] = br.readLine().split(" ");   //공백을 기준으로 문자열을 나눠 i차원배열이 가리키는 2차원 배열에 저장하도록 함
                Double temp = Double.parseDouble(peopleInfo[i][1]); //입력으로 들어온 값 중 키를 임시변수로 담고
                if(Double.compare(temp, max) >= 0){ //max값과 비교하여 max값을 설정
                    max = temp;
                }
            }

            for(int i = 0; i < testCase; i++){
                Double temp = Double.parseDouble(peopleInfo[i][1]); //키를 임시변수에 저장하고

                if(Double.compare(max, temp) == 0){ //max값과 일치하면 버퍼에 기록
                    bw.write(peopleInfo[i][0] + " ");
                }
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N11292().solution();
    }
}
