package BaekJoon;

import java.io.*;
import java.util.*;

//학생 인기도 측정
public class N25325 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int numberOfStudent = Integer.parseInt(br.readLine());  //학생 수
        Map<String, Integer> studentMap = new HashMap<>();  //학생이름과 인기도를 저장할 hashMap

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){  //학생이름과 초기 인기도를 저장
            studentMap.put(st.nextToken(), 0);
        }

        for(int i = 0; i < numberOfStudent; i++){
            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){  //좋아하는 학생 정보가 있을때 까지 반복
                String likeStudent = st.nextToken();
                if(studentMap.containsKey(likeStudent)){    //좋아하는 학생이 hashMap에 저장되어 있으면
                    studentMap.put(likeStudent, studentMap.get(likeStudent) + 1);   //인기도를 1 증가
                }
            }
        }

        List<String> keySet = new ArrayList<>(studentMap.keySet()); //정렬을 위한 ArrayList

        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(Objects.equals(studentMap.get(o1), studentMap.get(o2))){ //학생의 인기도가 같다면 이름이 사전순으로 앞서는 순서로
                    return o1.compareTo(o2);
                }

                return studentMap.get(o2).compareTo(studentMap.get(o1));    //인기도가 높은 순서대로
            }
        });

        for (String s : keySet) {
            bw.write(s + " " + studentMap.get(s) + "\n");   //학생 이름과 인기도를 버퍼에 기록
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N25325().solution();
    }
}
