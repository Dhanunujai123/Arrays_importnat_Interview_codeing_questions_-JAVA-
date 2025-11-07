package Arrays;

import java.util.Arrays;

public class zeroS_oneS_twoS_SortofanARRAY {
public static void main(String[] args) {
	int[] a= {1,2,1,2,0,0,2,1,0,1,0,1,2};
	
	
	int zeros_count=0;
	int ones_count=0;
	 
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==0)
		{
			zeros_count++;
			
		}
		if(a[i]==1)
		{
			ones_count++;
		}
	}
	for(int i=0;i<=zeros_count;i++)
	{
		a[i]=0;
	}
	for(int i=zeros_count+1;i<=zeros_count+ones_count;i++)
	{
		a[i]=1;
	}
	for(int i=(zeros_count+ones_count);i<a.length;i++)
	{
		a[i]=2;
	}
	
	for(int arr:a)
	{
		System.out.print(arr + " ");
	}
	
	System.out.println();
	Arrays.sort(a);
	for(int arr:a) {
		System.out.print(arr + " ");
	}
}
}
