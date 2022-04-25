package BaekJoon;

import java.util.Scanner;

//택시 기하학
public class N3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double euclidCircle = 0;
        double taxiCircle = 0;

        euclidCircle = Math.PI * r * r; //유클리드 기하학에서의 원 - 기준에서 부터 r만큼 떨어진 거리의 점들의 모임
        taxiCircle = r * r * 2; //택시 기하학에서의 원 - 기준에서 부터 r만큼 떨어진건 맞으나, 택시처럼 블럭을 따라 갈 수 있는 거리의 점들의 모임

        System.out.println(String.format("%6f", euclidCircle) + "\n" + String.format("%6f", taxiCircle));

    }
}
