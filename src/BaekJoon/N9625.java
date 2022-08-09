package BaekJoon;

import java.io.*;

//BABBA
public class N9625 {
    public static void main(String[] args) throws IOException {
        //하단의 주석처리는 처음 푼 실패코드 너무 정직하게 글자를 바꿔 추가하는 방식으로 짜서 메모리 초과가 나왔다.
        //테스트 케이스의 결과를 확인하니 피보나치 수열을 이루는 것을 확인하여 이를 이용해 풀었다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int countA = 0; //초기 카운팅 숫자 여기선 testCase가 1일때의 값과 같다.
        int countB = 1;

        int fiboNum1 = 0;
        int fiboNum2 = 1;
        int sum = 1;

        if(testCase == 2){  //피보나치 수열은 3항부터 의미가 있으므로 testCase가 2라면 두 카운트 모두 1이된다.
            countA = 1;
        }else if(testCase > 2){ //여기서 부터 피보나치 수열을 적용
            for(int i = 1; i <= testCase; i++){  //testCase를 피보나치 수열의 항으로 적용할 것이므로 반복 범위를 
                sum = fiboNum1 + fiboNum2;
                fiboNum1 = fiboNum2;
                fiboNum2 = sum;

                if(i == testCase -2){   //A의 개수는 B의 이전 항과 같으므로 -2로 설정
                    countA = sum;
                }

                if(i == testCase -1){
                    countB = sum;
                }
            }
        }

        br.close();
        bw.write(countA + " " + countB);
        bw.flush();
        bw.close();

    }

}
