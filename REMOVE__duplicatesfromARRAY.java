package Arrays;

import java.util.Arrays;

public class REMOVE__duplicatesfromARRAY {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,1,6,7,8,2,3,9};
		Arrays.sort(a);
		for(int arr:a)
		{
			System.out.print(arr+ " ");
		}
		
		//{1,1,2,2,3,3,4,6,7,8,9}
		
		int k=0;
		int[] finalarray=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=a[i+1])
			{
				finalarray[k++]=a[i];
			}
		}
		finalarray[k++]=a[a.length-1];
		for(int i=0;i<k;i++)
		{
		   System.out.println(finalarray[i]);
		}
	}

}
