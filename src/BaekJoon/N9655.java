package BaekJoon;

import java.util.Scanner;

//돌 게임
public class N9655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStone = sc.nextInt();   //돌의 개수
        sc.close();

        boolean skTurn = true;  //시작은 상근이 턴

        while(numberOfStone > 3){   //경기 결과는 마지막의 남은 돌의 개수로 판단하므로 3보다 클때 까지 반복
            numberOfStone -= 3;

            skTurn = !skTurn;   //반복 할때 마다 상근 <-> 창영 턴을 바꿔준다.
        }

        if(numberOfStone == 3 || numberOfStone == 1){   //남은 돌이 3개 또는 1개라면
           if(skTurn){  //상근이 턴이면 3개 또는 1개의 돌을 가져갈 수 있으므로 상근이 우승 
               System.out.println("SK");
           }else{
               System.out.println("CY");
           }
        }else{  //남은 돌이 2개라면
            if(skTurn){ //상근이 턴이면 무조건 1개만 가져가야 되므로 다음 순서인 창영이가 우승
                System.out.println("CY");
            }else{
                System.out.println("SK");
            }
        }
    }

}
