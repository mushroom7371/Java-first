package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//10부제
public class N10797 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int targetDay = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int carNumber = Integer.parseInt(st.nextToken());

            if(carNumber > 10){
                carNumber %= 10;
            }

            if(targetDay == carNumber){
                count++;
            }

        }

        bw.write(count + "");
        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N10797().solution();
    }
}
