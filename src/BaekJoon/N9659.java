package BaekJoon;

import java.io.*;

//돌 게임 5
public class N9659 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long numberOfStone = Long.parseLong(br.readLine());

        if(numberOfStone % 2 == 0){
            bw.write("CY");
        }else{
            bw.write("SK");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N9659().solution();
    }

}
