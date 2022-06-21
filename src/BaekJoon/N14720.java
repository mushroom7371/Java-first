package BaekJoon;

import java.io.*;
import java.util.Arrays;

//우유 축제
public class N14720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String marketArrayLength  = br.readLine();  //안쓰는 변수... 굳이 쓸 필요가 없었음
        int [] marketArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //우유 가게를 저장. Arrays.Stream설명은 이전 커밋 내용 중에 있음 ㅎㅎ
        int kindOfDrinkMilk = 0;    //마실 우유의 종류를 판단할 변수 첫 시작은 0(딸기우유)가 된다.
        int count = 0;  //마신 우유의 카운트를 저장할 변수

        for(int i = 0; i < marketArray.length; i++){    //우유가게의 수만큼 반복
            if(kindOfDrinkMilk == 0){   //마실 우유가 0(딸기우유)라면
                if(kindOfDrinkMilk == marketArray[i]){  //가게에서 파는 우유가 딸기 우유라면
                    count++;    //마신 후 카운트 증가
                    kindOfDrinkMilk = 1;    //다음 마실 우유는 1(초코우유)가 된다.
                }
            }else if(kindOfDrinkMilk == 1){ //마실 우유가 초코우유라면, 로직은 위와 같음
                if(kindOfDrinkMilk == marketArray[i]){
                    count++;
                    kindOfDrinkMilk = 2;
                }
            }else if(kindOfDrinkMilk == 2){ //마실 우유가 바나나우유 라면, 로직은 위와같음... 만약 가게에서 파는 유유가 마실 우유와 같지 않다면 다음 가게로 넘어가게 되있음
                if(kindOfDrinkMilk == marketArray[i]){
                    count++;
                    kindOfDrinkMilk = 0;
                }
            }
        }

        br.close();
        bw.write(count + "");
        bw.flush();
        bw.close();

    }
}
