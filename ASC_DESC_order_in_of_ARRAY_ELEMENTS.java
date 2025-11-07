package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ASC_DESC_order_in_of_ARRAY_ELEMENTS {
public static void main(String[] args) {
	String[] str= {"one","two","three","six","four"};
	Arrays.sort(str);
	for(String str1:str)
	{
		System.out.print(str1 + " ");
		
	}
	System.out.println();
	Arrays.sort(str,Collections.reverseOrder());
	for(String str2:str)
	{
		System.out.print(str2+ " ");
	}
}
}
