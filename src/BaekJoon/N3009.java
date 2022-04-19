package BaekJoon;

import java.io.*;

//네 번째 점
public class N3009 {
    public static void main(String[] args) throws IOException {
        //축에 평행한 직사각형을 만들기 위한 좌표를 찾는 문제로
        //x축에서 적게 나온 좌표, y축에서 가장 적게 나온 좌표를 위치로 가지는 점을 찾으면 된다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] x = new int[3];
        int [] y = new int[3];
        int answerX = 0;
        int answerY = 0;

        for(int i = 0; i < 3; i++){
            String [] arr = br.readLine().split(" ");
            x[i] = Integer.parseInt(arr[0]);
            y[i] = Integer.parseInt(arr[1]);
        }

        br.close();

        if(x[0] == x[1]){   //0번지, 1번지의 데이터가 같다면
            answerX = x[2]; //구하는 좌표의 x값은 2번지 데이터가 된다.
        }else if(x[0] == x[2]){
            answerX = x[1];
        }else{
            answerX = x[0];
        }

        if(y[0] == y[1]){   //0번지, 1번지의 데이터가 같다면
            answerY = y[2]; //구하는 좌표의 x값은 2번지 데이터가 된다.
        }else if(y[0] == y[2]){
            answerY = y[1];
        }else{
            answerY = y[0];
        }

        bw.write(answerX + " " + answerY);
        bw.flush();
        bw.close();

    }
}
