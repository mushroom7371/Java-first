package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//지능형 기차
public class N2455 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int sum = 0;
        int max = 0;

        for(int i = 0; i < 4; i++){
            st = new StringTokenizer(br.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            sum += in - out;

            if(max <= sum){
                max = sum;
            }
        }

        bw.write(max + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N2455().solution();
    }
}
