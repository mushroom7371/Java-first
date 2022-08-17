package BaekJoon;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

//큐
public class N10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        List<Integer> queue = new LinkedList<>();   //인덱스 편하게 보려고 LinkendList로 생성함

        for(int i = 0; i < testCase; i++){
            String [] commandArray = br.readLine().split(" ");  //공백을 기준으로 커맨드를 나눔
            String command = commandArray[0];   //0번지는 무조건 명령어가 됨

            switch (command){
                case "push" :
                    queue.add(0, Integer.parseInt(commandArray[1]));    //push의 경우 1번지에 숫자가 들어오며 이를 0번지에 밀어넣음(나머지는 한칸씩 밀리게됨)
                    break;
                case "pop"  :
                    if(queue.isEmpty()){
                        bw.write(-1 + "\n");
                    }else{
                        bw.write(queue.get(queue.size() - 1) + "\n");   //가장 앞의 숫자를(여기선 마지막 인덱스의 값) 출력하고
                        queue.remove(queue.size() - 1); //값 삭제
                    }
                    break;
                case "size"  :
                    bw.write(queue.size() + "\n");
                    break;
                case "empty"  :
                    if(queue.isEmpty()){
                        bw.write(1 + "\n");
                    }else{
                        bw.write(0 + "\n");
                    }
                    break;
                case "front"  :
                    if(queue.isEmpty()){
                        bw.write(-1 + "\n");
                    }else{
                        bw.write(queue.get(queue.size() - 1) + "\n");   //가장 앞의 값(여기선 맨 뒤의 인덱스) 출력
                    }
                    break;
                case "back"  :
                    if(queue.isEmpty()){
                        bw.write(-1 + "\n");
                    }else{
                        bw.write(queue.get(0) + "\n");  //가장 뒤의 값(여기선 맨 처음 인덱스) 출력
                    }
                    break;
            }

        }

        br.close();
        bw.flush();
        bw.close();

    }
}
