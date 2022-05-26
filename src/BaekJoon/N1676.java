package BaekJoon;

import java.util.Scanner;

//팩토리얼 0의 개수
public class N1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetNumber = sc.nextInt();
        int numberOfLastZero = 0;
        sc.close();

        numberOfLastZero = (targetNumber/5) + (targetNumber/25) + (targetNumber/125);   //5로 나눴을땐 +1, 5의 제곱으로 나눴을땐 추가+1, 5의 세제곱으로 나눴을땐 추가+1

        System.out.println(numberOfLastZero);

    }
}
