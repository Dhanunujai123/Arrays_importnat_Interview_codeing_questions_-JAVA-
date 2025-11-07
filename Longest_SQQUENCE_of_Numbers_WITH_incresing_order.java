package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Longest_SQQUENCE_of_Numbers_WITH_incresing_order {

	public static void main(String[] args) {
		int a[]= {1,2,3,1,2,1,3,4,5,7,8,1,2,4};
		System.out.println(longestSequenceofNumbers(a));
		
	}
	public static int longestSequenceofNumbers(int a[])
	{
		
		//List<Integer> array=new ArrayList<>();
		
		for(int i=0; i<a.length;i++)
		{
			//int previousindex=i
			int maxsequencecount=1;
			//int temp[];
			int k=0;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] < a[j])
				{
					System.out.println(a[i] + " ");
					maxsequencecount++;
			    }
				else {
					
					break;
					
				}
					

			}
		}
		return 0;
	}
	
}
