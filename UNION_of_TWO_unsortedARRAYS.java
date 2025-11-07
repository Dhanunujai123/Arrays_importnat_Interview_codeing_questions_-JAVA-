package Arrays;

import java.util.HashSet;
import java.util.Set;

public class UNION_of_TWO_unsortedARRAYS {
  
	public static void main(String[] args) {
	
	 int[] a= {1,2,3,4,6,7,8,1,4};
	 int[] b= {3,7,1,2,3,10};
	 
	 HashSet<Integer> set=new HashSet<>();
	 for(int num:a)
	 {
		 set.add(num);
		 
	 }
	 for(int num:b)
	 {
		 set.add(num);
	 }
	 int[] union=new int[set.size()];
	 int index=0;
	 for(int nums:set)
	 {
		 //int index=0;
		 union[index++]=nums;
	 }
	 for(int numss:union)
	 {
		 System.out.println(numss);
	 }
	}
}
