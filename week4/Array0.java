package week4;

import java.util.*;

class Array0 {
    public static void reorder(int[] arr) {
        int index = 0;
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i = index; i < arr.length; i++){
            arr[i]= 0;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 숫자 입력
        String input_ = in.nextLine();

        // 공백을 기준으로 문자열 배열로 분리
        String[] input = input_.split(" ");

        // 문자열 배열을 정수형 배열로 변환
        int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        reorder(arr); 

        System.out.println(Arrays.toString(arr));
    } 
}