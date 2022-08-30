package BaekJoon;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

//집합
public class N11723 {
    //문제에서 주어진 내용 그대로 코드로 옮겨 적은 것으로 따로 설명은 하지 않는다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    void add(int number, List set){
        List<Integer> tempList = set;
        boolean isExists = false;

        for(int i = 0; i < tempList.size(); i++){
            if(tempList.get(i) == number){
                isExists = true;
            }
        }

        if(!isExists){
            tempList.add(number);
        }
    }

    void remove(int number, List set){
        List<Integer> tempList = set;
        boolean isExists = false;
        int tempIdx = 0;

        for(int i = 0; i < tempList.size(); i++){
            if(tempList.get(i) == number){
                isExists = true;
                tempIdx = i;
            }
        }

        if(isExists){
            tempList.remove(tempIdx);
        }
    }

    void check(int number, List set) throws IOException{
        List<Integer> tempList = set;
        boolean isExists = false;

        for(int i = 0; i < tempList.size(); i++){
            if(tempList.get(i) == number){
                isExists = true;
            }
        }

        if(isExists){
            bw.write(1 + "\n");
        }else{
            bw.write(0 + "\n");
        }
    }

    void toggle(int number, List set){
        List<Integer> tempList = set;
        boolean isExists = false;
        int tempIdx = 0;

        for(int i = 0; i < tempList.size(); i++){
            if(tempList.get(i) == number){
                isExists = true;
                tempIdx = i;
            }
        }

        if(isExists){
            tempList.remove(tempIdx);
        }else{
            tempList.add(number);
        }
    }

    void all(List set){
        List<Integer> tempList = set;
        tempList.clear();

        for(int i = 1; i <= 20; i++){
            tempList.add(i);
        }
    }

    void empty(List set){
        List<Integer> tempList = set;
        tempList.clear();
    }

    void solution()throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        List<Integer> set = new LinkedList<>();

        for(int i = 0; i < testCase; i++){
            String [] input = br.readLine().split(" ");
            String command = input[0];
            int number = 0;

            if(input.length > 1){
                number = Integer.parseInt(input[1]);
            }

            switch (command){
                case "add"  :
                    add(number, set);
                    break;
                case "remove"  :
                    remove(number, set);
                    break;
                case "check"  :
                    check(number, set);
                    break;
                case "toggle"  :
                    toggle(number, set);
                    break;
                case "all"  :
                    all(set);
                    break;
                case "empty"  :
                    empty(set);
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N11723().solution();
    }
}
