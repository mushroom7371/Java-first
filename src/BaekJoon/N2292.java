package BaekJoon;

import java.util.Scanner;

//벌집
public class N2292 {
    //머리속으로만 풀려니 도저히 모르겠어서 하나하나 써보면서 규칙을 찾아 해결함...
    //n=1 일 때 방 한개
    //방 두개..    1+1(2)      ~ 6+1(7)          (2)                     (6x1 + 1)
    //방 세개..    6+2(8)      ~ 12+7(19)        (6x1 + 2)			    (6x2 + 6x1 + 1)
    //방 네개..    12+8(20)    ~ 18+19(37)	    (6x2 + 6x1 + 2)		    (6x3 + 6x2 + 6x1 + 1)	
    //방 다섯개..   18+20(38)   ~ 24+37(61)	    (6x3 + 6x2 +6x1 + 2)	(6x4 + 6x3 + 6x2 +6x1 + 1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;

        while(true){
            if(n == 1){ //방이 한개일때 1출력
                System.out.println(1);
                break;  //반복 종료
            }else if(n >= multi(i) + 2 && n <= multi(i+1) + 1){ //방의 갯수가 최상단 주석 안의 범위 내라면
                System.out.println(i+2);    //방 갯수를 출력
                break;
            }else{
                i++;
            }
        }
    }

    public static int multi(int n){ //6의 배수의 덧셈 기능을 따로 빼두었다
        int sum = 0;

        for(int i = 0; i <= n; i++){
            sum += 6*i;
        }

        return sum;
    }

}
