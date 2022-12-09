package BaekJoon;

import java.io.*;

//Triangles
public class N7595 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = 0;

        while((input = Integer.parseInt(br.readLine())) != 0){
            StringBuilder star = new StringBuilder();

            for(int i = 0; i < input; i++){
                star.append("*");
                bw.write(String.valueOf(star) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N7595().solution();
    }
}
