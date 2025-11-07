package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AN_ARRAY_Contains_Duplicates_or_NOT {
 public static void main(String[] args)
 {
	int[] a={1,1,2,3,2,4,5};
	List<Object> list=Arrays.asList(a);
	Set<Integer> set=new HashSet(list);
	if(list.size() != set.size())
	{
		System.out.println("the array contains duplicate elements : ");
	}
	else
	{
		System.out.println("the array does not contain duplicate elements : ");
	}
 
 
 }
}
