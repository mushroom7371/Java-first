package BaekJoon;

import java.io.*;
import java.util.*;

//걸그룹 마스터 준석이
public class N16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] numberOfTeamAndQuestion = br.readLine().split(" ");
        int numberOfTeam = Integer.parseInt(numberOfTeamAndQuestion[0]);    //걸그룹의 수
        int numberOfQuestion = Integer.parseInt(numberOfTeamAndQuestion[1]);    //문제의 수
        Map<String, String> teamAndMember = new HashMap<>();    //팀과 멤버를 담을 HashMap

        for(int i = 0; i < numberOfTeam; i++){  //걸그룹의 수만큼 반복
            String team = br.readLine();    //팀 이름
            int numberOfMember = Integer.parseInt(br.readLine());   //멤버의 수

            for(int j = 0; j < numberOfMember; j++){
                teamAndMember.put(br.readLine(), team); //이름 중복이 없으므로 이름을 key값으로, 중복이 허용되는 value는 팀이름으로 저장
            }
        }

        for(int i = 0; i < numberOfQuestion; i++){  //문제 수만큼 반복
            List<String> listForNameSort = new ArrayList<>();   //멤버 이름 출력 시 사전순으로 정렬 해야 되므로 정렬용 ArrayList 객체 생성
            String teamOrMember = br.readLine();    //팀 이름 또는 멤버이름
            String type = br.readLine();    //구해야 될 타입, 1이면 팀을 출력, 0이면 멤버들의 이름을 출력

            if(type.equals("1")){
                for (Map.Entry<String, String> entry : teamAndMember.entrySet()) {  //반복을 돌면서 멤버이름이 key값과 동일하면 팀 이름을 버퍼에 기록
                    String memberName = entry.getKey();
                    String teamName = entry.getValue();

                    if(teamOrMember.equals(memberName)){
                        bw.write(teamName + "\n");
                    }
                }
            }else{
                for (Map.Entry<String, String> entry : teamAndMember.entrySet()) {
                    String memberName = entry.getKey();
                    String teamName = entry.getValue();

                    if(teamOrMember.equals(teamName)){  //주어진 팀이름과 value의 팀이름이 같다면 key값(멤버이름)을 ArrayList에 저장
                        listForNameSort.add(memberName);
                    }
                }

                Collections.sort(listForNameSort);  //정렬
                for(int j = 0; j < listForNameSort.size(); j++){    //버퍼에 기록
                    bw.write(listForNameSort.get(j) + "\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
