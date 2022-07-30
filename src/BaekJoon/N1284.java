package BaekJoon;

import java.io.*;

//집 주소
public class N1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){    //반복 횟수가 주어지지 않고 조건을 주어졌기에 while 문 사용
            String number = br.readLine();  //입력 받은 숫자. String으로 담았다

            if(number.equals("0")){ //입력으로 들어온 숫자가 0이면 반복 종료
                break;
            }

            int sum = 2;    //좌,우 측 여백으로 초기 세팅

            for(int i = 0; i < number.length(); i++){   //숫자를 String으로 받았기에 길이만 큼 반복하며 숫자를 판단
                if(number.charAt(i) == '1'){    //1이라면 너비 +2
                    sum += 2;
                }else if(number.charAt(i) == '0'){  //0이라면 너비 +4
                    sum += 4;
                }else{  //그 이외는 너비 +3
                    sum += 3;
                }
            }

            sum += number.length() - 1; //숫자 사이에도 여백이 있으므로 숫자의 개수 -1 만큼 너비를 추가

            bw.write(sum + "\n");   //버퍼에 기록

        }

        br.close();
        bw.flush();
        bw.close();

    }
}
