package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//주사위 게임
public class N10103 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int round = Integer.parseInt(br.readLine());
        int changYoungScore = 100;
        int sangDukScore = 100;


        while(round --> 0){
            st = new StringTokenizer(br.readLine());
            int changYoungDice = Integer.parseInt(st.nextToken());
            int sangDukDice = Integer.parseInt(st.nextToken());

            if(changYoungDice > sangDukDice){
                sangDukScore -= changYoungDice;
            }else if(changYoungDice < sangDukDice){
                changYoungScore -= sangDukDice;
            }
        }

        bw.write(changYoungScore + "\n" + sangDukScore);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N10103().solution();
    }
}
