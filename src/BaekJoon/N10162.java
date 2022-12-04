package BaekJoon;

import java.io.*;

//전자레인지
public class N10162 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int time = Integer.parseInt(br.readLine());

        if(time % 10 != 0){
            bw.write("-1");
        }else{
            bw.write(time / 300 + " ");
            time %= 300;

            bw.write(time / 60 + " ");
            time %= 60;

            bw.write(time / 10 + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N10162().solution();
    }
}
