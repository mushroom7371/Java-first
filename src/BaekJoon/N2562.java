package BaekJoon;

import java.util.Scanner;

//최댓값
public class N2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[9];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == max){
                System.out.println(max);
                System.out.println(i+1);
            }
        }

    }
}
