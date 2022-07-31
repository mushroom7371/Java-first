package BaekJoon;

import java.util.Scanner;

//16진수
public class N1550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String targetNumber = sc.next();

        System.out.println(Integer.parseInt(targetNumber, 16));
    }
}
