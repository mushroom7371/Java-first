package BaekJoon;

import java.io.*;

//더하기 사이클
public class N1110 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String number = br.readLine();
        //버퍼 관련 내용은 N10951.java 파일 참고
        int num = Integer.parseInt(number);
        int fullNum = num;  //사이클의 기준이 될 숫자를 변수에 담았다
        int afterNum = -1;  //문제의 요구대로 변경할 숫자를 담음 변수 선언, 주어지는 숫자가 0~99까지 이므로 이를 피하기 위해 -1로 설정함
        int count = 0;      //사이클을 카운트할 변수 선언

        br.close();

        while(fullNum != afterNum){ //주어진 숫자가 요구대로 변경한 숫자와 일치하지 않으면 반복이 계속 진행된다. 반복 횟수를 모르므로 while문 사용
            afterNum = (num%10)*10 + (num/10 + num%10)%10;  //따로 설명하지 않는다 문제의 요구사항을 그대로 옮긴 코드임
            num = afterNum; //변경되고 난 숫자를 변수에 다시 담아 위의 연산에 참고하도록 하였다

            count++;    //반복이 실시되었다는 것은 한 사이클을 돌았다는 의미이기에 카운트가 증가한다.
        }

        bw.write(String.valueOf(count));
        //int형을 그대로 써보았으나 숫자가 깨져서 출력되었다 아마도 아스키코드로 출력 된것 같음
        //write()메서드에서 flush()메서드를 통한 숫자 출력은 String 타입으로 변환해야 됨을 알게됨.
        bw.flush();
        bw.close();

    }
}
