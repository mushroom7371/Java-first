package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//바이러스
public class N2606 {
    public static void main(String[] args) throws IOException {
        //풀긴 했으나 매우 좋지 않은 방법 인거 같다... 코드 리뷰가 필요함 Buffered 내용은 이전 커밋 내용들 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfComputer = Integer.parseInt(br.readLine()); //컴퓨터 수
        int numberOfConnection = Integer.parseInt(br.readLine());   //연결된 커넥션 수
        Set<Integer> connectionInfo = new HashSet<>();  //바이러스 걸린 컴퓨터를 중복제거 하여 담을 HashSet
        connectionInfo.add(1);  //1번 컴퓨터로 부터 전염되므로 초기에 담아둠
        String [] inputConnectionArray = new String [numberOfConnection];   //연결된 컴퓨터 정보가 담길 String 배열

        for(int i = 0; i < numberOfConnection; i++){    //입력으로 주어진 연결 정보들을 String 배열에 담아둔다.
            inputConnectionArray[i] = br.readLine();
        }

        Arrays.sort(inputConnectionArray);  //맘편하게 sort

        while(numberOfComputer > 0){
            //첨엔 while을 안걸고 아래 for문으로 순서대로, 반대로 돌려 set에 연결된 컴퓨터 정보를 저장했으나 중간에 박힌 커넥션 정보를 건너뛰는 현상이 발생했다.
            //그래서 모든 커넥션 정보를 전부 훑어 보고 저장 하도록 컴퓨터 대수 만큼 반복을 해서 건너뛰는 커넥션 정보가 없도록 함
            for(int i = 0; i < inputConnectionArray.length; i++){
                String [] connection = inputConnectionArray[i].split(" ");
                int connection1 = Integer.parseInt(connection[0]);
                int connection2 = Integer.parseInt(connection[1]);

                if(connectionInfo.contains(connection1)){   //서로 연결된 컴퓨터중 하나라도 바이러스에 걸린 컴퓨터라면(이미 HashSet에 저장된 컴퓨터는 바이러스가 걸려있다)
                    connectionInfo.add(connection2);
                }else if(connectionInfo.contains(connection2)){
                    connectionInfo.add(connection1);
                }
            }

            for(int i = inputConnectionArray.length - 1; i >= 0; i--){
                String [] connection = inputConnectionArray[i].split(" ");
                int connection1 = Integer.parseInt(connection[0]);
                int connection2 = Integer.parseInt(connection[1]);

                if(connectionInfo.contains(connection1)){
                    connectionInfo.add(connection2);
                }else if(connectionInfo.contains(connection2)){
                    connectionInfo.add(connection1);
                }
            }

            numberOfComputer--;
        }

        bw.write(connectionInfo.size() - 1 + "");   //숙주 컴퓨터인 1도 HashSet에 포함 되어 있으므로 이를 제외하고 출력

        br.close();
        bw.flush();
        bw.close();

    }
}
