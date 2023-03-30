package BaekJoon;

import java.io.*;

//2의 보수
public class N24389 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputNumber = Integer.parseInt(br.readLine());
        String binary = Integer.toBinaryString(inputNumber);
        String reverse = Integer.toBinaryString(~inputNumber);
        Long temp = Long.parseLong(reverse, 2) + 1;
        String target = Long.toBinaryString(temp);

        int [] bitArray = new int[32];
        int [] reverseBitArray = new int[32];

        int index = bitArray.length -1;
        for (int i = binary.length()-1; i >= 0; i--) {
            bitArray[index] = binary.charAt(i) - '0';
            index--;
        }

        int index2 = reverseBitArray.length-1;
        for (int i = target.length()-1; i >= 0; i--) {
            reverseBitArray[index2] = target.charAt(i) - '0';
            index2--;
        }

        int count = 0;
        for (int i = 0; i < bitArray.length; i++) {
            if (bitArray[i] != reverseBitArray[i]) {
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N24389().solution();
    }
}
