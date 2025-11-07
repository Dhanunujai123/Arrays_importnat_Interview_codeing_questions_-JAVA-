package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SQUARE_of_ELEMENTS_IN_ARRAY {
 public static void main(String[] args) {
	int a[]= {1,-2,5 ,3,1,4,5};
	List<Integer> list=new ArrayList<>();
	
	for(int i=0;i<a.length;i++)
	{
		list.add(a[i]*a[i]);
	}
	Collections.sort(list);
	System.out.print(list);
}
}
