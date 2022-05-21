package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

//ATM
public class N11399 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int [] times = new int[testCase];

        for(int i = 0; i < testCase; i++){
            times[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(times);
        int totalTime = 0;
        int prevTime = 0;
    
        //누적합을 이용한 시간 계산
        for(int i = 0; i < testCase; i++){
            totalTime += prevTime + times[i];
            prevTime += times[i];
        }

        System.out.println(totalTime);

    }

}
