package Arrays;

import java.util.HashSet;
import java.util.Set;

public class REMOVE_duplicatessfromARRAY {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,7,1,4,5};
		
		Set<Integer> list=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
		}
		System.out.println(list);
	}
		
		

}
