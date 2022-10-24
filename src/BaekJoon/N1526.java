package BaekJoon;

import java.io.*;

//가장 큰 금민수
public class N1526 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean numberFlag = false; //반복 시 7또는 4로 이루어진 수를 판단할 논리형 변수
        String inputNumber = br.readLine(); //입력 숫자

        while(!numberFlag){ //7 또는 4로 이루어진 수가 아닐때 반복
            boolean[] flagArray = new boolean[inputNumber.length()];    //숫자를 문자열로 취급해 각 자리를 판단할 예정으로 문자열의 길이 만큼의 논리형 변수를 담는 배열 선언
            boolean complete = true;    //완전한 7 또는 4로 이루어진 수인지 판단할 변수

            for(int i = 0; i < inputNumber.length(); i++){
                if(inputNumber.charAt(i) == '4' || inputNumber.charAt(i) == '7'){   //해당 인덱스의 문자가 7 또는 4 라면
                    flagArray[i] = true;    //해당 인덱스는 true값이 됨
                }

                if(!flagArray[i]){  //해당 인덱스가 false면 완전한 4또는 7로 이루어진 수가 아님
                    complete = false;
                }
            }

            int tempNumber = Integer.parseInt(inputNumber);
            tempNumber--;
            inputNumber = String.valueOf(tempNumber);

            if(complete){   //완전한 수가 맞으면 반복을 빠져나가기 위해 numberFlag값 변경
                numberFlag = true;
            }
        }

        bw.write(Integer.parseInt(inputNumber) + 1 + "");   //while문 하단에서 tempNumber가 1 감소 했기에 1증가 시킨 값을 출력
        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N1526().solution();
    }
}
