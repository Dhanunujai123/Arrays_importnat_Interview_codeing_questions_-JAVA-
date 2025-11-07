package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAJORITY_of_the_element_in_ARRAY {
  public static void main(String[] args) {
	
	  
	  int[] a= {1,2,3,2,5,4,2,2,5,7};
	  int count=0;
	  int majorityelemnt=a.length/2;
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=0;j<a.length;j++)
		  {
			  if(a[i]==a[j])
			  {
				  count++;
			  }
		  }
		  if(count> majorityelemnt)
		  {
			  System.out.print(a[i] + " ");
		  }
		  
		  
		  
	  }
	 
	  
	  
	  
	  
}
}
