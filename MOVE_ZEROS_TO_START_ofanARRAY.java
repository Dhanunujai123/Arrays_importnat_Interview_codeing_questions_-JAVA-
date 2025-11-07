package Arrays;

import java.util.Arrays;

public class MOVE_ZEROS_TO_START_ofanARRAY {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,0,0,3,4,4,0,5,2,0};
		
		
		/*Arrays.sort(a);
		for(int arr:a) {
		 System.out.print(arr+ " ");
		}
		
		*/
		int lastindex=a.length-1;
		for(int i=a.length-1;i>=0; i--)
		{
			if(a[i] !=0)
			{
				a[lastindex]=a[i];
				lastindex--;
				
			}
		}
		for(int i=0;i<=lastindex;i++)
		{
			
			a[i]=0;
		}
		  for(int arr:a)
		  {
		     System.out.print(arr + " ");
		  }
	   
	}
}
