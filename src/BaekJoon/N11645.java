package BaekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

//I’ve Been Everywhere, Man
public class N11645 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            int cities = Integer.parseInt(br.readLine());
            Set<String> citySet = new HashSet<>();  //한번이라도 방문한 도시는 재 카운팅 되지 않기에 Set을 사용

            for(int i = 0; i < cities; i++){
                citySet.add(br.readLine());
            }

            bw.write(citySet.size() + "\n");

        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N11645().solution();
    }
}
