package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Coffee
public class N18706 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){  //테스트 케이스가 0이 될때까지 반복
            StringTokenizer st = new StringTokenizer(br.readLine());
            int kindOfCoffee = Integer.parseInt(st.nextToken());    //커피의 종류
            int people = Integer.parseInt(st.nextToken());  //주문 인원 수
            int deliveryFee = 100/people;   //배달비는 100에서 인원수로 나눔
            String[][] coffeeArray = new String[kindOfCoffee][4];   //1차 배열이 커피이름, 가격(스몰, 미디움, 라지)이 담긴 2차배열을 가리키도록 함

            for(int i = 0; i < kindOfCoffee; i++){  //커피 종류, 사이즈별 가격을 배열에 저장
                st = new StringTokenizer(br.readLine());

                for(int j = 0; j < 4; j++){
                    coffeeArray[i][j] = st.nextToken();
                }
            }

            for(int i = 0; i < people; i++){    //주문 인원 만큼 반복
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();   //주문자
                String size = st.nextToken();   //커피 사이즈
                String coffee = st.nextToken(); //커피 이름
                int price = 0;  //가격

                for(int j = 0; j < coffeeArray.length; j++){    //커피정보가 담긴 배열을 돌면서 조건에 맞는 정보를 찾는다.
                    if(coffee.equals(coffeeArray[j][0])){   //주문한 커피가 배열에 담긴 커피와 일치한다면
                        switch (size){  //사이즈를 찾아 가격을 책정한다. 커피가격 + 배달비
                            case "small"   :
                                price = Integer.parseInt(coffeeArray[j][1]) + deliveryFee;
                                break;
                            case "medium"   :
                                price = Integer.parseInt(coffeeArray[j][2]) + deliveryFee;
                                break;
                            case "large"   :
                                price = Integer.parseInt(coffeeArray[j][3]) + deliveryFee;
                                break;
                        }

                        if(price % 5 == 1){ //가격이 5배수에서 1만큼 크거나 작다면 5의 배수로 퉁침
                            price -= 1;
                        }else if(price % 5 == 4){
                            price += 1;
                        }

                        bw.write(name + " " + price + "\n");
                        break;
                    }
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N18706().solution();
    }
}
