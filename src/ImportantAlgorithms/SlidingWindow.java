package ImportantAlgorithms;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.max;

public class SlidingWindow
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        int k=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
       slidingWindow(arr,k,n);
    }

    private static void slidingWindow(int[] arr, int k, int n) {

       int window_sum=0;
        for(int i=0;i<k;i++)
        {
            window_sum+=arr[i];
        }

        int max_sum=window_sum;
        for(int i=k;i<n;i++)
        {
            window_sum-=arr[i-k];
            window_sum+=arr[i];
            max_sum=Math.max(window_sum,max_sum);
        }
         System.out.println(max_sum);
    }
}
