package BaekJoon;

import java.io.*;

//출석 이벤트
public class N25704 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int coupon = Integer.parseInt(br.readLine())/5; //쿠폰의 개수. 5로 나눈 이유는 구간이 0~4, 5~9, 10~14 등으로 나눠져있기에 몫으로 판단 하기 위함임
        int price = Integer.parseInt(br.readLine());    //가격
        int minPrice = price;   //쿠폰 적용시 최소 금액이 담길 변수

        for(int i = 0; i <= coupon; i++){
            int tempPrice = price;  //비교를 위한 임시 변수

            switch (i){
                case 1 :
                    tempPrice -= 500;
                    if(minPrice > tempPrice){   //쿠폰 적용시 할인률 적용보다 고정금액 차감이 더 최소일 경우가 있으므로 최고금액을 판단해준다.
                        minPrice = tempPrice;
                    }
                    break;
                case 2 :
                    tempPrice *= 0.9;
                    if(minPrice > tempPrice){
                        minPrice = tempPrice;
                    }
                    break;
                case 3 :
                    tempPrice -= 2000;
                    if(minPrice > tempPrice){
                        minPrice = tempPrice;
                    }
                    break;
                case 4 :
                    tempPrice *= 0.75;
                    if(minPrice > tempPrice){
                        minPrice = tempPrice;
                    }
                    break;
            }
        }

        if(minPrice < 0){
            bw.write("0");
        }else{
            bw.write(minPrice + "");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N25704().solution();
    }
}
