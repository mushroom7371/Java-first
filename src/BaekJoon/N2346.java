package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

//풍선 터뜨리기
public class N2346 {
    public static void main(String[] args) throws IOException {
        //whlie문 내부의 for문에서 주어진 이동 횟수 만큼 정직하게 반복했더니 메모리 초과가 나타났다. 쓸모없는 반복을 줄이는 것이 핵심
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfBalloons = Integer.parseInt(br.readLine()); //풍선의 개수
        int [] indexArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();  //N2693 참고, 여기선 순차적으로 풍선 속 이동 정보가 쓰여진 종이가 담긴다.
        Deque<Integer> balloonDeque = new LinkedList<>();   //데이터를 앞,뒤로 이동하여 저장할 것이므로 Linkedlist로 Deque 구현

        for(int i = 1; i <= numberOfBalloons; i++){ //풍선의 번호 설정
            balloonDeque.addLast(i);
        }

        while(balloonDeque.size() > 0){ //덱에 데이터가 있을 때 까지 반복
            int target = indexArray[balloonDeque.peekFirst() - 1];  //풍선이 1부터 시작하므로 종이가 담긴 배열에서 -1을 해줌
            bw.write(balloonDeque.pollFirst() + " ");   //덱의 맨 앞의 데이터를 빼서 기록

            if(balloonDeque.size() == 0){   //덱의 크기가 1일때 바로 위의 코드에서 데이터를 뺏기에 사이즈가 0이 되기 때문에 종료 조건을 걸어둠
                break;
            }

            if(target > 0){ //오른쪽으로 이동, 맨 앞의 데이터를 맨 뒤로 옮기는데 첫 반복부터 뒤로 옮기기에 -1을 더해줌
                for(int i = 0; i < (target - 1)%balloonDeque.size(); i++){
                    //여기서 나머지 연산자가 필요함. 예를 들어 풍선이 2개가 남았을 때 종이에 적힌 이동 정보가 10이라고 한다면,
                    //둘 중 하나를 선택하는 것인데도 불구하고 10번동안 데이터를 옮기는 작업을 하기에 메모리가 많이 쓰이게 된다.
                    //때문에 나머지 연산자를 이용해서 나온 수만큼 반복해야 낭비를 줄일 수 있다.
                    balloonDeque.addLast(balloonDeque.pollFirst());
                }
            }else{  //왼쪽으로 이동, 음수이므로 -를 붙혀 양수로 바꿔줌. 위와는 다르게 덱의 맨뒤 데이터를 앞으로 옮기므로 target만큼 반복
                target = -target;
                for(int i = 0; i < target%balloonDeque.size(); i++){
                    balloonDeque.addFirst(balloonDeque.pollLast());
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
