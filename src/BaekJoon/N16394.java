package BaekJoon;

import java.util.Scanner;

//홍익대학교
public class N16394 {

    void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n - 1946;

        System.out.println(result);

        sc.close();
    }

    public static void main(String[] args) {
        new N16394().solution();
    }
}
