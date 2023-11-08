package string;
import java.util.Scanner;
public class StringPalidromOrNot {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)==s.charAt(s.length()-i-1))
			{
				count++;
			}
		}
          if(count==s.length()/2)
          {
        	  System.out.println("Palidrome");
          }
          else
          {
        	  System.out.println("Not palidrome");
          }
	}

}
