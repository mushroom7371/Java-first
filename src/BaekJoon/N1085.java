package BaekJoon;

import java.io.*;

//직사각형에서 탈출
public class N1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] str = br.readLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int w = Integer.parseInt(str[2]);
        int h = Integer.parseInt(str[3]);
        //입력받은 현재 위치값과 직사각형의 크기를 각각의 변수에 할당

        br.close();

        int answerW = 0;    //가로의 최소 도달길이를 담을 변수
        int answerH = 0;    //세로의 최소 도달 길이를 담을 변수

        if(w - x > x){  //가로 길이 - 현재 위치의 값이 현재 위치 값보다 크다면
            answerW = x;    //가로의 최소 도달길이는 x가 된다
        }else{
            answerW = w - x;
        }

        if(h - y > y){  //세로 길이 - 현재 위치의 세로 값이 현재 위치 값보다 크다면
            answerH = y;    //세로의 최소 도달길이는 y가 된다.
        }else{
            answerH = h - y;
        }

        if(answerW > answerH){  //둘중에 작은 쪽이 최소 도달 길이가 된다.
            bw.write(answerH + "");
        }else{
            bw.write(answerW + "");
        }

        bw.flush();
        bw.close();

    }

}
