package BaekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//Final Score
public class N15233 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int teamA = Integer.parseInt(st.nextToken());   //A팀의 인원수
        int teamB = Integer.parseInt(st.nextToken());   //B팀의 인원수
        int totalGoals = Integer.parseInt(st.nextToken());  //골 넣은 사람의 이름
        Set<String> teamSetA = new HashSet<>(); //A팀 선수 이름을 담을 HashSet
        Set<String> teamSetB = new HashSet<>(); //B팀 선수 이름을 담을 HashSet
        int teamACount = 0; //A팀 골 수
        int teamBCount = 0; //B팀 골 수

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < teamA; i++){ //HashSet에 A팀 선수 이름을 담음
            teamSetA.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < teamB; i++){ //HashSet에 B팀 선수 이름을 담음
            teamSetB.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < totalGoals; i++){
            String people = st.nextToken();

            if(teamSetA.contains(people)){  //골을 넣은 선수가 A팀에 속해 있다면 A팀 골 카운트 증가
                teamACount++;
            }else { //골을 넣은 선수가 B팀에 속해 있다면 B팀 골 카운트 증가
                teamBCount++;
            }
        }

        if(teamACount > teamBCount){
            bw.write("A");
        }else if(teamACount < teamBCount){
            bw.write("B");
        }else{  //동점인 경우
            bw.write("TIE");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N15233().solution();
    }
}
