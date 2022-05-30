package BaekJoon;

import java.io.*;
import java.util.Stack;

//제로
public class N10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Stack<Integer> numberStack = new Stack<>();
        int sum = 0;

        for(int i = 0; i < testCase; i++){
            int number = Integer.parseInt(br.readLine());
            if(number == 0){    //입력 숫자가 0이라면
                numberStack.pop();  //스택에 저장된 마지막 데이터를 제거
            }else{  //아니라면 스택에 해당 숫자를 저장
                numberStack.push(number);
            }
        }

        for(int i = 0; i < numberStack.size(); i++){    //스택 사이즈 만큼 돌면서 합을 계산
            sum += numberStack.get(i);
        }

        br.close();
        bw.write(sum + "");
        bw.flush();
        bw.close();

    }
}
