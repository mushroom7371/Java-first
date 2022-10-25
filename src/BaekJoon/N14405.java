package BaekJoon;

import java.io.*;

//피카츄
public class N14405 {
    //처음에는 replace()로 해당 단어를 공백("")으로 치환 하였으나, pkai 같은 문자열을 생각 못해 틀렸었다. 그래서 아래와 같이 바꿈
    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int count = 0;  //치환된 단어를 카운팅 할 변수

        input = input.replace("pi", "1");   //치환 문자를 1로 바꾸어준다.
        input = input.replace("ka", "1");
        input = input.replace("chu", "1");

        for(int i = 0; i < input.length(); i++){    //치환된 횟수(1이 몇개인지)를 카운팅 한다.
            if(input.charAt(i) == '1'){
                count++;
            }
        }

        if(input.length() != count){    //치환된 횟수와 문자열의 길이가 같지 않으면 완전한 치환이 이뤄지지 않은 것임
            bw.write("NO");
        }else{
            bw.write("YES");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N14405().solution();
    }
}
