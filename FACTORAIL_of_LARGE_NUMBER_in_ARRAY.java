package Arrays;

import java.util.Arrays;

public class FACTORAIL_of_LARGE_NUMBER_in_ARRAY {
   public static void main(String[] args) {
	
	int[] a= {1,4,2,4,5};
	Arrays.sort(a);
	
	for(int num:a)
	{
		System.out.print(num+ " ");
	}
	
	int largenumber=a[a.length-1];
	System.out.println("\nthe large number is : " +largenumber);
	int fact=1;
	for(int i=largenumber;i>0;i--)
	{
		//int fact=1;
		fact=fact*i;
	}
	System.out.println("the factorial of largenumber " +largenumber+ " is : " +fact);
  }
}
