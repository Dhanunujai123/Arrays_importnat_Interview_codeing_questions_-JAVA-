package Arrays;

import java.util.HashSet;

public class INTERSECTION_of_TWO_SORTEDARRAYS {
public static void main(String[] args) {
	int[] a= {1,1,2,2,5,5,6,6,7,8,8,9};
	int[] b= {1,1,1,2,3,3,4,8,8,9};
	
	HashSet<Integer> set=new HashSet<>();
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==a[j])
			{
				set.add(a[i]);
			}
		}
	}
	for(int num:set)
	{
		System.out.print(num + " ");
	}
	
}
}
