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
        // 숫자 사이의 공백 제거
        String input = input_.replace(" ", "");
        // int 배열 생성
        int[] arr = new int[input.length()];

        // 입력 받은 문자열 정수를 int 배열로 분할
        for(int i=0; i<input.length(); i++) {
            arr[i] = input.charAt(i) - '0';
        }

        reorder(arr); 

        System.out.println(Arrays.toString(arr));
    } 
}