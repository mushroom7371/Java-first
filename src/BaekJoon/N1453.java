package BaekJoon;

import java.io.*;
import java.util.Arrays;

//피시방 알바
public class N1453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] seatArray = new int[101];    //배열이 0번지 부터 시작해서 크기를 101로 설정 총 좌석은 100 이므로
        int testCase = Integer.parseInt(br.readLine());
        int [] people = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rejectPeople = 0;   //거절된 사람의 수

        for(int i = 0; i < testCase; i++){
            if(seatArray[people[i]] == 0){  //i번째 사람이 원하는 좌석이 비어있으면
                seatArray[people[i]]++; //해당 자리는 차게된다.
            }else{  //비어 있지 않다면 거절된 사람의 카운트가 증가된다.
                rejectPeople++;
            }
        }

        br.close();
        bw.write(rejectPeople + "");
        bw.flush();
        bw.close();

    }
}
