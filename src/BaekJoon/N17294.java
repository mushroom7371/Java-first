package BaekJoon;

import java.io.*;
import java.util.Arrays;

//귀여운 수~ε٩(๑> ₃ <)۶з
public class N17294 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numberArray = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();   //문자열로 주어진 숫자를 한 자리씩 int로 변환하여 배열에 저장
        int difference = 0; //등차인지 확인할 변수(공차)
        String result = "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!";  //기본값

        if(numberArray.length >= 2){    //배열에 저장된 길이가 2이상일 경우
            difference = numberArray[1] - numberArray[0];   //공차 설정
            for(int i = 1; i < numberArray.length -1; i++){ //숫자간 차이가 등차인지 확인할 반복
                int tempDifference = numberArray[i+1] - numberArray[i];
                if(tempDifference != difference){   //등차가 아니라면 문자열의 내용을 바꿔준다.
                    result = "흥칫뿡!! <(￣ ﹌ ￣)>";
                    break;
                }
            }
        }

        bw.write(result);

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N17294().solution();
    }
}
