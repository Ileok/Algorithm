import java.util.Scanner;

public class FindElement {
       static int findElement(int[] arr, int n) {
    	   int[] leftMax = new int[n];
    	   leftMax[0] = Integer.MIN_VALUE;
    	   
    	   for (int i = 1; i < n; i++)
    		   leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
    	   
    	   int rightMin = Integer.MAX_VALUE;
    	   for (int i = n - 1; i >= 0; i--) {
    		   if (leftMax[i] < arr[i] && rightMin > arr[i])
    			   return i;
    		   rightMin = Math.min(rightMin, arr[i]);
    		   }
    	   return -1;
    	   }

       public static void main(String args[]) {
    	   Scanner in = new Scanner(System.in);
    	   System.out.println("입력 예시 : 5 1 4 3 6 8 10 7 9");
    	   System.out.print("배열 입력 : ");
    	   String input = in.nextLine();
    	   String data[] = input.split(" ");
    	   int[] arr = new int[data.length];
    	   for(int i = 0; i < data.length; i++) {
    		   arr[i] = Integer.parseInt(data[i]);
    	   }
           int n = arr.length;
           System.out.println("배열의 모든 왼쪽 값은 자신의 값보다 작고, 모든 오른쪽 값은 자신의 값보다 큰 항목 : " +
           findElement(arr, n)+"번 인덱스");
           }
       }
