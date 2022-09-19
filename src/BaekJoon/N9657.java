package BaekJoon;

import java.io.*;

//돌 게임 3
public class N9657 {

    void solution() throws IOException{
        //가져 갈 수 있는 돌을 7로 나눈 나머지의 경우를 보면 정답을 유추 할 수 있다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long numberOfStone = Long.parseLong(br.readLine());

        if(numberOfStone % 7 == 0 || numberOfStone % 7 == 2){
            bw.write("CY");
        }else{
            bw.write("SK");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N9657().solution();
    }
}
