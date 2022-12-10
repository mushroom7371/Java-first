package BaekJoon;

import java.io.*;

//영수증
public class N5565 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = Integer.parseInt(br.readLine());

        for(int i = 0; i < 9; i++){
            result -= Integer.parseInt(br.readLine());
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N5565().solution();
    }
}
