package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//변수명
public class N16205 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String type = st.nextToken();
        String input = st.nextToken();
        List<String> inputList = new ArrayList<>();

        if(type.equals("2")){
            String[] inputArray = input.split("_");
            for(int i = 0; i < inputArray.length; i++){
                inputList.add(inputArray[i]);
            }
        }else{
            StringBuilder sb = new StringBuilder(input);
            StringBuilder temp = new StringBuilder();
            while(!sb.isEmpty()){
                if(sb.charAt(0) >= 'A' && sb.charAt(0) <= 'Z' && !temp.isEmpty()){
                    inputList.add(String.valueOf(temp));
                    temp.setLength(0);
                }

                temp.append(sb.charAt(0));
                sb.deleteCharAt(0);

                if(sb.isEmpty()){
                    inputList.add(String.valueOf(temp));
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N16205().solution();
    }
}
