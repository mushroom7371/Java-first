package BaekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

//숫자 세는 양 (Small)
public class N14381 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 1; i <= testCase; i++){ //단순히 출력을 위해 1부터 반복 시작, 어차피 반복 횟수가 중요하기에 별 상관 없긴 하다
            int inputNumber = Integer.parseInt(br.readLine());  //곱셈을 편하게 하기 위해 int형으로 변환
            int multi = 1;  //주어진 입력에서 곱할 숫자
            Set<Character> sleepSet = new HashSet<>();  //중복없이 숫자를 담기 위한 HashSet

            if(inputNumber == 0){   //0~9까지의 숫자를 담을 수 없는 경우
                bw.write("Case #" + i + ": INSOMNIA" + "\n");
            }else{
                while(sleepSet.size() < 10){    //HashSet의 크기가 10 미만인 것은 0~9까지의 숫자가 담기지 않은 것임
                    int tempNumber = inputNumber * multi;   //입력수 X 곱

                    String strNumber = String.valueOf(tempNumber);  //문자열로 바꿔 각 인덱스 숫자를 뽑아낼 예정으로 다시 형변환

                    for(int j = 0; j < strNumber.length(); j++){
                        sleepSet.add(strNumber.charAt(j));  //해당 인덱스의 숫자를 HashSet에 저장한다.
                    }

                    multi++;    //곱할 숫자를 증가시킴
                }

                bw.write("Case #" + i + ": " + inputNumber * (multi - 1) + "\n");
            }

        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N14381().solution();
    }
}
