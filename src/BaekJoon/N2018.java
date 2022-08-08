package BaekJoon;

import java.io.*;

//수들의 합5
public class N2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int targetNumber = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = targetNumber; i > 0; i--){  //주어진 숫자부터 1까지 1씩 감소하면서 반복
            int sum = 0;    //합을 저장할 변수

            for(int j = i; j > 0; j--){ //i부터 1까지 반복
                sum += j;   //합을 저장하고
                if(sum == targetNumber){    //합이 주어진 수와 같다면 카운트 증가 및 반복 종료
                    count++;
                    break;
                }else if(sum > targetNumber){   //조금이나마 시간을 절약하기 위해 넣은 코드
                    break;
                }
            }
        }

        br.close();
        bw.write(count + "");
        bw.flush();
        bw.close();

    }
}
