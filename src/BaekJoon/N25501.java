package BaekJoon;

import java.io.*;

//재귀의 귀재
public class N25501 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String s = br.readLine();
            count = 0;
            bw.write(isPalindrome(s) + " " + count + "\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }

    static int count = 0;

    int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) throws IOException {
        new N25501().solution();
    }
}
