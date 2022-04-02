package BaekJoon;

import java.io.*;

//분수찾기
public class N1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());    //x번째 분수
        br.close();

        int diagonal = 1;   //해당 범위의 대각선 칸의 갯수
        int prevDiagonalSum = 0; //이전 대각선까지의 누적 합

        while(true){
            if(x <= prevDiagonalSum + diagonal){    //x번째 분수가 대각선의 칸 수의 범위 내에 있다면
                if(diagonal % 2 == 1){  //대각선 칸의 갯수가 홀수라면
                    bw.write((diagonal - (x - prevDiagonalSum -1)) + "/" + (x - prevDiagonalSum));
                    break;
                }else { //대각선 칸의 갯수가 짝수라면
                    bw.write((x - prevDiagonalSum) + "/" + (diagonal - (x - prevDiagonalSum -1)));
                    break;
                }
            }else{  //주어진 x번재 분수가 범위 밖에 있으면
                prevDiagonalSum += diagonal;    //이전 대각선의 합은 해당 범위의 대각선 칸의 갯수를 더하고
                diagonal++; //칸수를 1 증가시킨다.
            }
        }

        bw.flush();
        bw.close();

    }
}
