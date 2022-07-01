package BaekJoon;

import java.io.*;
import java.util.Arrays;

//Doubles
public class N4641 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){    //반복 횟수가 주어지지 않으므로 항상 반복 하도록 설정
            int [] numberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //N2693 참고
            int count = 0;  //2배가 되는 수를 카운트할 변수 매 반복마다 재설 정해야되므로 지역변수로 할당

            if(numberArray.length == 1){    //입력의 끝이 -1이므로 배열의 길이가 1이되면 while문 종료
                break;
            }

            for(int i = 0; i < numberArray.length - 1; i++){    //배열의 길이 -1인 이유는 입력의 마지막 수가 0으로 주어지기에 이를 제외 시켜야 하기 때문
                for(int j = 0; j < numberArray.length - 1; j++){    //i번지 숫자의 2배가 되는 j번지 데이터가 있으면 카운트 증가
                    if(numberArray[i] * 2 == numberArray[j]){
                        count++;
                    }
                }
            }

            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
