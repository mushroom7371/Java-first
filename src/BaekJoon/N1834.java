package BaekJoon;

import java.util.Scanner;

//나머지와 몫이 같은 수
public class N1834 {
    public static void main(String[] args) {
        //규칙 찾기 문제 number 가 1일때 없음, 2일때 3, 3일때 4,8 4일때 5,10 .... number + 1의 배수가 된다.
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long sum = 0;

        for(int i = 0; i < number; i++){
            sum += (number + 1) * i;
        }

        System.out.println(sum);

    }
}
