package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//터렛
public class N1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Integer> coordinatesArray = new ArrayList<>();
        String [] coordinatesStringArray;
        double centerDistance = 0;
        double radius1 = 0;
        double radius2 = 0;

        for(int i = 0; i < N; i++){
            coordinatesStringArray = br.readLine().split(" ");
            for(int j = 0; j < coordinatesStringArray.length; j++){
                coordinatesArray.add(Integer.parseInt(coordinatesStringArray[j]));
            }
            centerDistance = Math.sqrt(Math.pow(coordinatesArray.get(0) - coordinatesArray.get(3),2) + Math.pow(coordinatesArray.get(1) - coordinatesArray.get(4),2));
            /**/
            int x1 = coordinatesArray.get(0);
            int y1 = coordinatesArray.get(1);
            int r1 = coordinatesArray.get(2);

            int x2 = coordinatesArray.get(3);
            int y2 = coordinatesArray.get(4);
            int r2 = coordinatesArray.get(5);

            centerDistance = ((x1 + x2) ^ 2 + (y1 + y2) ^ 2) ^ (1/2);

            double newRadius1 = Math.max(r1, r2);
            double newRadius2 = Math.min(r1, r2);
            double sumOfRadius = newRadius1 + newRadius2;
            double diffOfRadius = newRadius1 - newRadius2;
            /**/


            // radius is the same
            if (newRadius1 == newRadius2){
                if(centerDistance == 0){
                    bw.write(-1 + "" + "\n");
                }
                else if (sumOfRadius > centerDistance){
                    //두번 만남
                    bw.write(2 + "" + "\n");
                }
                else if(sumOfRadius == centerDistance){
                    //한번
                    bw.write(1 + "" + "\n");
                }
                else if(sumOfRadius < centerDistance){
                    //만나지 않음
                    bw.write(0 + "" + "\n");
                }
            }

            //radius1 > radius2
            else{
                if (centerDistance == 0){
                    bw.write(0 + "" + "\n");
                }
                else if (sumOfRadius > centerDistance){
                    //두번 만나거나 안에서 한번만나거나 안에서 안만남
                    if(diffOfRadius == centerDistance){
                        //한번만남
                        bw.write(1 + "" + "\n");
                    }else if(diffOfRadius > centerDistance){
                        //안만남
                        bw.write(0 + "" + "\n");
                    } else{
                        //두번만남
                        bw.write(2 + "" + "\n");
                    }
                }
                else if(sumOfRadius == centerDistance){
                    //한번만남
                    bw.write(1 + "" + "\n");
                }
                else if(sumOfRadius < centerDistance){
                    //죽어도 못만남
                    bw.write(0 + "" + "\n");
                }
            }


//
//            if(radius1 == radius2 && centerDistance == 0){  //접점 무한개
//                bw.write(-1 + "" + "\n");
//            }else if(radius1 + radius2 > centerDistance && Math.max(radius1, radius2) <= centerDistance){  //접점 2개
//                bw.write(2 + "" + "\n");
//            }else if(radius1 + radius2 == centerDistance){ //접점 1개
//                bw.write(1 + "" + "\n");
//            }else if(Math.abs(radius2 - radius1) == centerDistance){ //접점 1개
//                bw.write(1 + "" + "\n");
//            }else if(radius1 + radius2 < centerDistance){ //접점 0개
//                bw.write(0 + "" + "\n");
//            }else if(Math.abs(radius2 - radius1) > centerDistance){ //접점 0개
//                bw.write(0 + "" + "\n");
//            }

            coordinatesArray.clear();
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
