package BaekJoon;

import java.io.*;

//하얀 칸
public class N1100 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] chess = new String[8][8];
        int count = 0;

        for(int i = 0; i < 8; i++){
            chess[i] = br.readLine().split("");
        }

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0 && !chess[i][j].equals(".")){
                        count++;
                    }
                }else{
                    if(j % 2 == 1 && !chess[i][j].equals(".")){
                        count++;
                    }
                }
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N1100().solution();
    }
}
