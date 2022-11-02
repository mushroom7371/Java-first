package BaekJoon;

import java.io.*;

//고무오리 디버깅
public class N20001 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int question = 0;

        while(!(input = br.readLine()).equals("고무오리 디버깅 끝")){
            if(input.equals("문제")){
                question++;
            }else{
                if(question > 0){
                    question--;
                }else{
                    question += 2;
                }
            }
        }

        if(question == 0){
            bw.write("고무오리야 사랑해");
        }else{
            bw.write("힝구");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N20001().solution();
    }
}
