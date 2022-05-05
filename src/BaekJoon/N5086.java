package BaekJoon;

import java.io.*;

//배수와 약수(End of File)
public class N5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] testNumArr;   //문자열로 주어진 입력을 나누기 위한 String 배열
        int inputNum1 = 0;  //첫번째 수
        int inputNum2 = 0;  //두번째 수

        while(true){    //반복횟수가 주어지지 않았으므로 항상 반복
            testNumArr = br.readLine().split(" ");  //주어진 입력을 공백으로 나눠 String 배열에 저장

            inputNum1 = Integer.parseInt(testNumArr[0]);    //int타입으로 변환 하여 저장
            inputNum2 = Integer.parseInt(testNumArr[1]);

            if(inputNum1 == 0 && inputNum2 == 0){   //EOF 처리를 위한 조건 각각의 변수에 담긴 숫자가 0이면 반복을 종료 한다.
                break;
            }

            if(inputNum2 % inputNum1 == 0){ //첫번째 숫자가 두번째 숫자의 약수라면
                bw.write("factor" + "\n");
            }else if(inputNum1 % inputNum2 == 0){   //첫번째 숫자가 두번째 숫자의 배수라면
                bw.write("multiple" + "\n");
            }else{  //둘다 아니라면
                bw.write("neither" + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
