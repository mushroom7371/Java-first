package BaekJoon;

import java.io.*;
import java.util.Arrays;

//한조서열정리하고옴ㅋㅋ
public class N14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int [] hanzoArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();  //N1026 주석 참고
        int maxKill = 0;    //한조의 최대 킬 수

        for(int i = 0; i < testCase; i++){
            int kill = 0;   //반복 시 해당 한조의 킬수를 저장할 변수를 초기화

            for(int j = i; j < testCase - 1; j++){  //i번째 한조 부터 오른쪽으로 비교
                if(hanzoArray[i] > hanzoArray[j+1]){    //i번째 한조가 있는 봉우리가 오른쪽 한조들의 봉우리 보다 높다면 kill 추가
                    kill++;
                }else{  //아니면 반복 종료
                    break;
                }
            }

            if (maxKill < kill) {   //최대 킬 수가 i번째 한조의 킬 수보다 적다면
                maxKill = kill; //최대 킬 수를 수정
            }
        }

        br.close();
        bw.write(maxKill + "");
        bw.flush();
        bw.close();

    }
}
