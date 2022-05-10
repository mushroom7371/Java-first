package BaekJoon;

import java.io.*;

//링
public class N3036 {
    public static void main(String[] args) throws IOException {
        //기준원이 한바퀴 돌때 비교되는 원이 몇 바퀴 도는지 구하는 문제로 원의 둘레 공식은 2πr 이지만, 지름(2r)은 공통으로 계산되므로 반지름의 비율로 구할 수 있다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfCircle = Integer.parseInt(br.readLine());   //원의 개수
        String [] inputForSplit = br.readLine().split(" "); //주어진 입력을 공백으로 나눠 배열에 저장
        int criteriaCircle = Integer.parseInt(inputForSplit[0]);    //기준 원의 반지름
        int subCircle = 0;  //비교할 원의 반지름을 담을 변수
        int gcd = 0;    //최대 공약수를 담을 변수
        br.close();

        for(int i = 1; i < numberOfCircle; i++){    //비교할 원의 갯수만큼 반복(배열에 0번지엔 기준원의 반지름이므로 1번지 부터 시작)
            subCircle = Integer.parseInt(inputForSplit[i]); //반복 시행 마다 변수에 저장
            gcd = getGCD(criteriaCircle, subCircle);    //두원의 반지름에 대한 최대 공약수를 리턴 받아 저장

            //기약분수로 표현 해야되므로 기준원과 비교원의 최대공약수를 연산하여 버퍼에 기록
            bw.write(criteriaCircle/gcd + "/" + subCircle/gcd + "\n");
        }

        bw.flush();
        bw.close();
    }

    //최대 공약수 구하기(재귀호출)
    public static int getGCD(int numberA, int numberB){
        if(numberB == 0){
            return numberA;
        }else{
            return getGCD(numberB, numberA % numberB);
        }
    }

}
