import java.util.*;

class Main
{
    static void rearrange(int arr[])
    {
        int i=0,j=arr.length-1;
        while(i<j)
        {
           if(arr[i]>0&&arr[j]<0)
           {
               i++;
               j--;
           }
           if(arr[i]>0&&arr[j]>0)
           {
               i++;
           }
           if(arr[i]<0&&arr[j]>0)
           {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;
           }
        }
        j=0;
        while(i<arr.length)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j=j+2;
            i++;
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[]={2,3,-4,-1,6,-9,9,9};
        rearrange(arr);
    }
    }
