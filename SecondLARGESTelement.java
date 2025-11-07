package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class SecondLARGESTelement {
 public static void main(String[] args) {
	int[] a= {5,4,7,1,2,10,9,8,6};
	Arrays.sort(a);
	/*for(int arr:a)
	{
		System.out.println(arr);
	}*/
	List<Integer> arr=new ArrayList<>();
	for(int i=0;i<a.length;i++)
	{
		arr.add(a[i]);
	}
	System.out.println(arr);
	int lengthlist=arr.size()-2;
	System.out.println("The second largest Element in an array : " +lengthlist);
}
}
