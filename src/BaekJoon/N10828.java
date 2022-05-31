package BaekJoon;

import java.io.*;
import java.util.Stack;

//스택
public class N10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> numberStack = new Stack<>();
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            String [] inputArray = br.readLine().split(" ");    //push 가 입력으로 주어질때 공백을 기준으로 주어지므로 split을 사용해서 배열에 저장
            String command = inputArray[0]; //명령어

            if(command.equals("push")){ //command == "push" 라고 사용하면 안됨. 문자열은 같아보이나 서로 다른 String객체로 주소값이 다르므로 조건에 걸리지 않음
                numberStack.push(Integer.parseInt(inputArray[1]));
            }else if(command.equals("pop")){
                if(numberStack.size() == 0){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(numberStack.peek() + "\n");
                    numberStack.pop();
                }
            }else if(command.equals("size")){
                bw.write(numberStack.size() + "\n");
            }else if(command.equals("empty")){
                if(numberStack.size() == 0){
                    bw.write(1 + "\n");
                }else{
                    bw.write(0 + "\n");
                }
            }else if(command.equals("top")){
                if(numberStack.size() == 0){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(numberStack.peek() + "\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
