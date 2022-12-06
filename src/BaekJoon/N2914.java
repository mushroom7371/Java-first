package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//저작권
public class N2914 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int song = Integer.parseInt(st.nextToken());    //노래 개수
        int average = Integer.parseInt(st.nextToken()); //평균

        if(song == 1){  //노래의 수가 1일 경우
            bw.write(average + "");
        }else{ 
            bw.write(song * (average - 1) + 1 +""); //평균을 올림 하기 때문에 제일 작은 수를 구하기 위한 수식
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N2914().solution();
    }
}
