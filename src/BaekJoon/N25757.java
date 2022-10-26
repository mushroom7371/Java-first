package BaekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//임스와 함께하는 미니게임
public class N25757 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int people = Integer.parseInt(st.nextToken());  //입력으로 주어질 사람의 수
        String kindOfGame = st.nextToken(); //게임 종류
        Set<String> nameSet = new HashSet<>();  //중복된 인원의 이름을 제거할 HashSet

        for(int i = 0; i < people; i++){    //입력 문자열을 HashSet에 저장
            nameSet.add(br.readLine());
        }

        int count = 0;  //최대로 할 수 있는 게임 수

        switch (kindOfGame){
            case "Y" :
                count = nameSet.size()/1;   //임스와 함께 하기 때문에 2명이지만, 임스를 제외하면 1이 된다. 이하 아래도 임스를 뺀 2, 3이됨.
                break;
            case "F" :
                count = nameSet.size()/2;
                break;
            case "O" :
                count = nameSet.size()/3;
                break;
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N25757().solution();
    }
}
