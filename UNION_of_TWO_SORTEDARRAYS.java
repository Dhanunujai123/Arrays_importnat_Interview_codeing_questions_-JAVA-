package Arrays;

import java.util.TreeSet;

public class UNION_of_TWO_SORTEDARRAYS {
	public static void main(String[] args) {
		int a[]= {1,1,2,3,4,5,5,6};
		int b[]= {1,2,2,4,4,6,7,10,20};
		
		TreeSet<Integer> set=new TreeSet<>();
		for(int num:a)
		{
			set.add(num);
		}
		
		for(int num:b)
		{
			set.add(num);
		}
		for(int num:set)
		{
			System.out.print(num+ " ");
		}
		
		
	}

}
