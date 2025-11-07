package Arrays;

import java.util.HashSet;

public class INTERSECTION_of_TWO_UNSORTEDARRAYS {
public static void main(String[] args) {
	int[] a= {1,2,6,3,5,4,3,6,1,9,7,8};
	int[] b= {2,1,5,3,6,9,7,8,1};
	
	HashSet<Integer> set=new HashSet<>();
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			set.add(a[i]);
		}
	}
	
	for(int num:set)
	{
		System.out.print(num + " ");
	}
	
}
}
