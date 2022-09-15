package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//samba
public class N5263 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfpeople = Integer.parseInt(st.nextToken());  //쌈바 축제 참가 인원수
        int numberOfArrange = Integer.parseInt(st.nextToken()); //짝을 이룰 숫자
        Map<Integer, Integer> peopleInfo = new HashMap<>(); //id 값을 key로 저장할 HashMap

        for(int i = 0; i < numberOfpeople; i++){
            int id = Integer.parseInt(br.readLine());

            if(peopleInfo.containsKey(id)){ //해당 id의 인원이 존재 한다면, value값을 1 증가 시킴
                peopleInfo.put(id, peopleInfo.get(id) + 1);
            }else{  //처음 보는 id라면 초기 값으로 1세팅
                peopleInfo.put(id, 1);
            }
        }

        for(int key : peopleInfo.keySet()){
            if(peopleInfo.get(key) % numberOfArrange != 0){ //해당 id를 가진 인원의 수를 짝지었을 때 사람이 남는다면
                bw.write(key + "\n");   //id를 버퍼에 기록
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N5263().solution();
    }
}
