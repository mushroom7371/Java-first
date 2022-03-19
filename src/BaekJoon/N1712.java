package BaekJoon;

import java.io.*;

//손익분기점
public class N1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] str = br.readLine().split(" ");
        //첫줄에 입력된 숫자를 공백으로 나눠 배열의 각 번지에 저장한다

        int fixedCosts = Integer.parseInt(str[0]);  //고정 비용
        int variableCost = Integer.parseInt(str[1]);    //가변 비용
        int price = Integer.parseInt(str[2]);   //가격
        //총 비용과 총 수입이 같아지는 지점을 구하자면, price X n = fixedCosts + (variableCost X n) 이 된다
        //공통 부분인 갯수 n을 기준으로 항을 정리하면 n = fixedCosts / (price - variableCost) 이 된다.
        //위의 공식은 같아지는 것을 나타냄으로 갯수에 1을 더해야 수익이 나는 것을 알 수 있으며
        //이를 수식으로 정리하면, (fixedCosts / (price - variableCost)) + 1 이 된다.
        //수익이 나지 않는 다는 것은 판매 갯수가 음수가 됨을 의미한다.
        //즉, (fixedCosts / (price - variableCost)) + 1 의 수식에서 분모인 price - variableCost 이 <= 0이 되는 구간이 되면 이익이 발생하지 않는 경우가 된다.

        if(price <= variableCost){
            System.out.println("-1");
        }else{
            System.out.println((fixedCosts/(price - variableCost)) + 1);
        }

    }
}
