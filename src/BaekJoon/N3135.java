package BaekJoon;

import java.io.*;

//라디오
public class N3135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] inputFrequencyArray = br.readLine().split(" ");
        int currentFrequency = Integer.parseInt(inputFrequencyArray[0]);    //현재 주파수
        int targetFrequency = Integer.parseInt(inputFrequencyArray[1]);     //목표 주파수
        int testCase = Integer.parseInt(br.readLine()); //즐겨찾기에 등록된 주파수 개수
        int minMove = Math.abs(currentFrequency - targetFrequency); //현재 주파수에서 목표 주파수 까지 이동하기 위한 눌릴 버튼의 횟수
        boolean isBookMarkMove = false; //즐겨찾기로 이동했는지 판단할 논리형 변수

        for(int i = 0; i < testCase; i++){
            int tempDistance = Math.abs(targetFrequency - Integer.parseInt(br.readLine())); //즐겨찾기에 저장된 주파수와 목표 주파수까지의 거리

            if(minMove > tempDistance){ //최소 이동 횟수에 저장된 값이 tempDistance 에 저장된 값보다 크다면
                minMove = tempDistance; //즐겨찾기에서 이동하는 것이 더 적은 횟수를 가지므로 minMove를 재 설정함
                isBookMarkMove = true;  //즐겨찾기로 이동했기에 true로 변경
            }

        }

        if(isBookMarkMove){ //즐겨찾기에서 가는게 빠른 경우는 즐겨찾기 버튼을 누르는것도 1회 포함되기에 1을 추가하여 버퍼에 기록
            bw.write(minMove + 1 + "");
        }else{  //즐겨찾기를 사용하지 않은 경우
            bw.write(minMove + "");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
