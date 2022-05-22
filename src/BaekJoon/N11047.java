package BaekJoon;

import java.util.Scanner;

//동전 O
public class N11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kindOfCoin = sc.nextInt();  //코인 종류
        int targetPrice = sc.nextInt(); //주어진 금액
        int [] coinArray = new int[kindOfCoin]; //각각의 가치를 가진 코인 배열
        int count = 0;  //최소 동전 갯수를 저장할 변수

        for(int i = 0; i < kindOfCoin; i++){    //코인 가치를 저장할 반복
            coinArray[i] = sc.nextInt();
        }

        for(int i = kindOfCoin - 1; i >= 0; i--){   //가장 적은 갯수를 구할 예정으로 큰 가치부터 작은 가치까지 반복
            if(coinArray[i] <= targetPrice){    //금액보다 같거나 작으면
                count += (targetPrice / coinArray[i]);  //카운트에 해당 금액을 나눈 몫을 더하고
                targetPrice %= coinArray[i];    //금액을 재설정한다.
            }
        }

        System.out.println(count);

    }
}
