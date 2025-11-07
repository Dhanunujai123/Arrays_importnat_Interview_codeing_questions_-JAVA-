package Arrays;

public class Occurance_of_an_element {
  public static void main(String[] args) {
	
	  int[] a= {1,2,3,2,1,2};
	  int element=1;
	  int count=0;
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]==element)
		  {
			  count++;
			  
		  }
	  }
	  System.out.println("the occurance of element " + element+ " is : " +count+ " times");
}
}
