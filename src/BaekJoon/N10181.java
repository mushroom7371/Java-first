package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//Federation Favorites
public class N10181 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while(!(input = br.readLine()).equals("-1")){   //입력 문자열이 -1이 아니면 반복
            int inputNumber = Integer.parseInt(input);
            int sum = 0;
            List<Integer> tempList = new ArrayList<>();

            for(int i = 1; i < inputNumber; i++){   //1부터 입력 숫자 전까지 반복
                if(inputNumber % i == 0){   //해당 숫자가 약수에 해당한다면 ArrayList에 저장하고, 합을 계산
                    tempList.add(i);
                    sum += i;
                }
            }

            if(sum == inputNumber){ //약수들의 합이 주어진 입력과 같다면 ArrayList에 담긴 항목들을 버퍼에 기록
                bw.write(inputNumber + " = ");
                for(int i = 0; i < tempList.size(); i++){
                    if(i == tempList.size() - 1){
                        bw.write(tempList.get(i) + "");
                    }else{
                        bw.write(tempList.get(i) + " + ");
                    }
                }
            }else{
                bw.write(inputNumber + " is NOT perfect.");
            }

            bw.write("\n");

        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N10181().solution();
    }
}
