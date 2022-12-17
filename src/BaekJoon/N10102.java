package BaekJoon;

import java.io.*;

//개표
public class N10102 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfJudges = Integer.parseInt(br.readLine());
        String[] resultArray = br.readLine().split("");
        int count = 0;

        for(int i = 0; i < numberOfJudges; i++){
            if(resultArray[i].equals("A")){
                count++;
            }else{
                count--;
            }
        }

        if(count > 0){
            bw.write("A");
        }else if(count < 0){
            bw.write("B");
        }else{
            bw.write("Tie");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N10102().solution();
    }
}
