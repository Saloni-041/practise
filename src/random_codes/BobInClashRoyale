package random_codes;

public class BobInClashRoyale
{
    public static void main(String[] args) {
        int testcase=3;
        int arr[]={7,9,17};
        int arrnew[]=new int[testcase];
        int j=0;

        for(int x=0;x<arr.length;x++)
        {
            int arrAnd=arr[x];

            for(int i=arr[x]-1;i>=1;i--)
            {
                if((i&arrAnd)!=0)
                    arrAnd=i&arrAnd;
                else
                {
                    arrnew[j]=i;
                    j++;
                    break;
                }
            }
        }
        for(int i=0;i<arrnew.length;i++)
        {
            System.out.println(arrnew[i]);
        }

    }
}
