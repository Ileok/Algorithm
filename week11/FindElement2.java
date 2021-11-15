public class FindElement2 {
	static void findElement(int[] arr, int n) {
		int[] leftMax = new int[n];
		int[] rightMin = new int[n];
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++)
        	leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
        rightMin[n-1] = Integer.MAX_VALUE;
        	for (int i = n-2; i >= 0; i--) {
        		if(rightMin[i+1] > arr[i+1])
        			rightMin[i] = arr[i+1];
        		else 
        			rightMin[i] = rightMin[i+1];
        		}
        	int sts = 0;
        	for (int i=0; i < n; i++) {
        		if (leftMax[i] < arr[i] && rightMin[i] > arr[i]) {
        			System.out.print(" " + i);
        			sts = 1;
        			}
        		}
        	if (sts == 0)
        	System.out.println("-1");
        	}
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		findElement(arr, n);
		}
	}