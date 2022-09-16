package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//가희와 방어율 무시
public class N25238 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double monsterInfo = Integer.parseInt(st.nextToken());  //몬스터의 방어율
        double userInfo = Integer.parseInt(st.nextToken()); //유저의 방무
        double result = monsterInfo - (monsterInfo * (userInfo/100));   //유저가 체감하는 몬스터의 방어율 수치

        if(result >= 100){
            bw.write(0 + "");
        }else{
            bw.write(1 + "");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N25238().solution();
    }
}
