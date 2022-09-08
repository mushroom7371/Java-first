package BaekJoon;

import java.io.*;

//별 찍기 - 4
public class N2441 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] starArray = new String[N];
        int index = 0;

        for(int i = 0; i < starArray.length; i++){
            starArray[i] = "*";
        }

        while(index < N){
            for(int i = 0; i < starArray.length; i++){
                bw.write(starArray[i]);
            }
            bw.write("\n");

            starArray[index] = " ";
            index++;
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N2441().solution();
    }
}