package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//유니대전 퀴즈쇼
public class N20362 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCase = Integer.parseInt(st.nextToken());
        String winner = st.nextToken(); //우승자 이름
        Map<String, String> peopleMap = new HashMap<>();    //이름이 곂치는 경우가 없으므로 hashMap으로 key 중복 체크
        String answer = ""; //정답

        while(testCase --> 0){
            st = new StringTokenizer(br.readLine());
            String people = st.nextToken(); //정답을 외친 사람
            String tempAnswer = st.nextToken(); //위 인원이 답한 대답

            peopleMap.put(people, tempAnswer);  //hashMap에 이름을 key로 대답을 value로 저장

            if(people.equals(winner)){  //대답한 인원이 우승자라면
                answer = tempAnswer;    //정답을 저장하고 반복 종료
                break;
            }
        }

        int count = -1; //위의 로직을 보면 정답자는 무조건 hashMap에 저장되어 있기에 초기 값을 -1로 설정

        for(Map.Entry<String, String> entrySet : peopleMap.entrySet()){ //hashMap에 저장된 데이터 만큼 반복
            if(entrySet.getValue().equals(answer)){ //정답이 일치하는 사람이라면 카운트 증가
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N20362().solution();
    }
}
