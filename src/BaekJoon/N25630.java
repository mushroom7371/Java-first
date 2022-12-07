package BaekJoon;

import java.io.*;

//팰린드롬 소떡소떡
public class N25630 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String soTteok = br.readLine(); //입력으로 주어진 소떡
        char[] halfCharArray = new char[length/2];  //반절 나눠 앞의 문자를 담을 배열
        char[] halfReverseCharArray = new char[length/2];   //반절 나눠 뒤의 문자를 담을 배열
        int count = 0;  //팰린드롬 소떡을 만들기위한 변경 횟수

        for(int i = 0; i < halfCharArray.length; i++){  //소떡의 반절을 나눠 각각의 배열에 저장
            halfCharArray[i] = soTteok.charAt(i);
            halfReverseCharArray[i] = soTteok.charAt(length -1 -i); //인덱스 취급주의!
        }

        for(int i = 0; i < halfCharArray.length; i++){  //서로 다른 문자가 있다면 카운트 증가
            if(halfCharArray[i] != halfReverseCharArray[i]){
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N25630().solution();
    }
}

