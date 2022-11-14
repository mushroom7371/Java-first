package BaekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

//No Duplicates
public class N15098 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputArray = br.readLine().split(" ");
        Set<String> inputSet = new HashSet<>();

        for(int i = 0; i < inputArray.length; i++){ //중복 체크를 위해 HashSet에 단어를 저장함
            inputSet.add(inputArray[i]);
        }

        if(inputArray.length != inputSet.size()){   //입력 배열의 길이와 HashSet에 저장된 길이가 다르다면
            bw.write("no");
        }else{
            bw.write("yes");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N15098().solution();
    }
}
