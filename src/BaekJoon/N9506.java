package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//약수들의 합
public class N9506 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int inputNumber = Integer.parseInt(br.readLine());
            List<Integer> tempList = new ArrayList<>();
            int sum = 0;

            if(inputNumber == -1){  //입력이 -1이라면 반복 종료
                break;
            }

            for(int i = 1; i < inputNumber; i++){
                if(inputNumber % i == 0){   //약수라면 list에 담고, 해당 약수를 합해준다.
                    tempList.add(i);
                    sum += i;
                }
            }

            if(sum == inputNumber){ //합이 입력값과 같다면 출력 형식대로 약수정보 추가
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

    public static void main(String[] args) throws IOException{
        new N9506().solution();
    }
}
