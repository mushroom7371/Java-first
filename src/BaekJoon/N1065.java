package BaekJoon;

import java.io.*;

//한수(메서드 구현)
public class N1065 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        han(num);   //입력 받은 문자를 인자로 하여 메서드 호출, void로 선언하여 따로 리턴값이 없다

        br.close();
    }

    static void han(String number) throws IOException{  //기능을 따로 빼두었고 static 으로 선언하여 객체 생성없이 클래스가 메모리에 올라갈때 생성되어 사용가능하다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String answer = "";
        int absNum1 = 0;    //첫번째 등차
        int absNum2 = 0;    //두번째 등차
        int count = 0;  //한수의 갯수

        for(int i = Integer.valueOf(number); i >= 1; i--){ //입력 받은 수부터 1까지 반복한다.
            answer = String.valueOf(i); //자리수를 이용하여 등차를 구하기 위해 int 타입을 String 타입으로 바꾸었다.
            //나누기와 나머지 연산자를 통해 int 타입을 그대로 쓸수 있었으나 문제 풀 때 String에 꽂혀 생각이 안났다

            if(i >= 100){   //100이상의 숫자에서만 등차가 존재하므로 조건을 걸었다
                absNum1 = Integer.valueOf(answer.charAt(0)-'0') - Integer.valueOf(answer.charAt(1)-'0');
                absNum2 = Integer.valueOf(answer.charAt(1)-'0') - Integer.valueOf(answer.charAt(2)-'0');
                //문자열에 담긴 문자를 숫자로 바꾸고 빼서 변수에 담아두고

                if(absNum1 == absNum2){ //그 둘이 같다면 카운트가 증가한다.
                    count++;
                }
            }else{
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}
