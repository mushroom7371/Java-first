package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//주사위 게임
public class N2476 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int maxCashPrize = 0;   //최대 상금이 담길 변수

        while(testCase --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] diceArray = new int[7];   //배열은 0번지 부터 시작이라 1~6의 주사위 숫자 카운팅을 위해 크기를 7로 잡음
            int count = 0;  //중복 개수를 셀 변수
            int diceNumber = 0; //중복이 있다면 그 주사위 숫자를, 중복이 없으면 최대 숫자를 담을 변수
            int cashPrize = 0;  //해당 인원의 상금

            for(int i = 0; i < 3; i++){
                int tempDiceNumber = Integer.parseInt(st.nextToken());
                diceArray[tempDiceNumber]++;    //배열의 번지(주사위 숫자)를 카운팅 한다.
            }

            for(int i = 1; i < diceArray.length; i++){
                if(diceArray[i] >= count){  //배열을 돌면서 해당 번지(주사위 숫자)의 카운트를 센다
                    count = diceArray[i];
                    diceNumber = i;
                }
            }

            cashPrize = calculation(count, diceNumber); //문제의 수식을 계산하여 변수에 담고
            if(maxCashPrize < cashPrize){   //최대값인지 판단
                maxCashPrize = cashPrize;
            }
        }

        bw.write(maxCashPrize + "");

        br.close();
        bw.flush();
        bw.close();
    }

    int calculation(int count, int diceNumber){
        if(count == 3){
            return 10000 + (diceNumber * 1000);
        }

        if(count == 2){
            return 1000 + diceNumber * 100;
        }

        return diceNumber * 100;
    }

    public static void main(String[] args) throws IOException{
        new N2476().solution();
    }
}
