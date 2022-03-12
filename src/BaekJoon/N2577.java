package BaekJoon;

import java.util.Scanner;

//숫자의 개수
public class N2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multi = sc.nextInt() * sc.nextInt() * sc.nextInt(); //키보드로 부터 입력 받은 수를 바로 연산하여 변수에 담았다
        String multiStr = String.valueOf(multi);    //해당 자릿수의 숫자를 편하게 구하기 위해 String으로 숫자를 담아 두었다 하단 참고
        int [] numArr = new int[10];    //0~9까지 숫자가 쓰인 횟수를 구하기위해 배열 선언, 초기값 0

        for(int i = 0; i < numArr.length; i++){ //0~9까지 어느 숫자가 쓰였는지 구하기 위해 반복
            for(int j = 0; j < multiStr.length(); j++){ //주어진 숫자의 자릿수 만큼 반복
                int num = multiStr.charAt(j) - '0'; //charAt()을 통해 숫자가 아스키코드로 반환되지만, -'0'을 통해 숫자로 연산된다.
                if(num == i){   //주어진 숫자의 해당 자리에 있는 수가 i와 같다면
                    numArr[i]++;    //카운팅이 늘어난다.
                }
            }
        }

        for(int i = 0; i < numArr.length; i++){
            System.out.println(numArr[i]);
        }

    }
}
