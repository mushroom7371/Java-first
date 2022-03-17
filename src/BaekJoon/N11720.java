package BaekJoon;

import java.util.Scanner;

//숫자의 합
public class N11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //키보드로 부터 입력 받기 위해 Scanner 객체 생성
        int count = sc.nextInt();   //입력받은 갯수를 저장
        String num = sc.next();     //입력받은 숫자를 문자열로 저장
        int sum = 0;

        sc.close(); //사용하고 난 Scanner의 스트림을 닫아주기 위해 사용

        for(int i = 0; i < count; i++){
            sum += num.charAt(i) - '0';
            //charAt()은 해당 문자의 아스키코드 값을 반환하므로 -'0'을 통하여 숫자로 변환하여 준다. ex) '1'은 아스키코드로 49, '0'은 48 빼주어 1이 된다.
        }

        System.out.println(sum);

    }
}
