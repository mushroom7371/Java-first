package BaekJoon;

import java.io.*;

//달팽이는 올라가고 싶다
public class N2869 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] snailInfo = br.readLine().split(" "); //주어진 문자열을 나눠 String 배열에 저장

        br.close();
        bw.write(completeDay(snailInfo) + "");
        bw.flush();
        bw.close();

    }

    public static int completeDay(String [] snailInfo){ //기능을 분할함. static으로 선언 하여 클래스가 메모리에 적재될때 생성됨
        int ascend = Integer.parseInt(snailInfo[0]);    //오르는 길이
        int slip = Integer.parseInt(snailInfo[1]);  //미끄러지는 길이
        int stickHeight = Integer.parseInt(snailInfo[2]);   //나무 막대의 길이
        int cDay = (stickHeight - slip)/(ascend - slip);

        if((stickHeight - slip) % (ascend - slip) != 0){    //잔여 길이가 남는다면 다음날 다시 올라야 꼭대기에 도달한다.
            cDay++;
        }

        return cDay;
    }

}
