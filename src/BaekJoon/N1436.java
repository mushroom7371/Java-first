package BaekJoon;

import java.util.Scanner;

//영화감독 숌
public class N1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int number = 0;
        int count = 0;

        while(true){
            number++;   //반복 도입시 숫자를1 증가시키고
            String numberStr = Integer.toString(number);    //number를 문자열로 바꿔 저장

            if(numberStr.contains("666")){  //해당 문자열이 666을 포함하고 있으면 count증가
                count++;
            }

            if(count == N){ //count가 N과 일치하면 반복 종료
                break;
            }
        }

        System.out.println(number); //number 출력
    }
}
