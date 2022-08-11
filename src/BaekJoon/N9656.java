package BaekJoon;

import java.util.Scanner;

//돌 게임2
public class N9656 {
    public static void main(String[] args) {
        //9655번 돌 게임와 같은 로직 다만 이기는 사람만 바뀌었다
        Scanner sc = new Scanner(System.in);
        int numberOfStone = sc.nextInt();
        sc.close();

        boolean skTurn = true;

        while(numberOfStone > 3){
            numberOfStone -= 3;

            skTurn = !skTurn;
        }

        if(numberOfStone == 3 || numberOfStone == 1){
            if(skTurn){
                System.out.println("CY");
            }else{
                System.out.println("SK");
            }
        }else{
            if(skTurn){
                System.out.println("SK");
            }else{
                System.out.println("CY");
            }
        }
    }
}
