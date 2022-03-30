package BaekJoon;

import java.io.*;

//설탕 배달
public class N2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int kg = Integer.parseInt(br.readLine());
        br.close();

        bw.write(plasticBag(kg) + "");
        bw.flush();
        bw.close();

    }

    public static int plasticBag(int kg){
        int kilogram = kg;  //주어진 설탕의 무게로 초기화
        int bag = 0;    //봉지수

        while(true){    //반복 횟수가 로직에 따라 변하므로 항상 반복하도록 while문 사용
            if(kilogram % 5 == 0){  //주어진 무게가 5로 나눠 떨어진다면
                bag += kilogram/5;  //최소 봉지 수는 무게를 5로 나눈 몫이 된다.
                break;  //반복 종료
            }else{  //5로 나눠 떨어지지 않는다면
                kilogram -= 3;  //무게를 3만큼 줄여서 재 설정(3키로 봉지에 담는다)
                bag++;  //봉지 카운트가 증가
            }

            //위의 결과대로 수행 했지만, 5와 3의 배수의 합으로도 나눠 떨어지지 않는 경우가 발생한다면
            //ex) 11 = 5*1 + 3*2,, 14 = 5*2 + 3*1 + 1
            if(kilogram < 0){   //위의 로직에서 무게를 3만큼 빼기 때문에 딱 맞지 않는다면 무게는 음수가 될 수 밖에 없다.
                bag = -1;   //봉지수는 -1로 설정하고
                return bag; //메서드 호출의 결과로 -1을 반환
            }
        }

        return bag;
    }

}
