package arrays;
import java.util.*;

/*
 * Kadane's Algorithm to find the maxSubarray Sum in O(n)[Linear Time Complexity]
 */
public class KadanesAlgorithm {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) 
			a[i] = sc.nextInt();
		
		 int maxSum = 0;
		 int currentSum = 0;
		 
		 for(int i=0 ;i<n ;i++){
		        currentSum += a[i];
		        if(currentSum<0)
		            currentSum=0;

		        maxSum = Math.max(maxSum, currentSum);
		    }
		 
		 System.out.println(maxSum);
	}
}
