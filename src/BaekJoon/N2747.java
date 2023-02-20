package BaekJoon;

import java.io.*;

//피보나치 수
public class N2747 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int target = Integer.parseInt(br.readLine());
        int result = 0;

        result = getFibonacciNumber(target);
        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    int getFibonacciNumber(int target) {
        int[] fib = new int[target > 2 ? target + 1 : 3];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;

        for(int i = 2; i <= target; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[target];
    }

    public static void main(String[] args) throws IOException {
       new N2747().solution();
    }
}
