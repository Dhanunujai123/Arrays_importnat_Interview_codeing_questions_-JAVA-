package Arrays;

import java.util.Arrays;

public class MAX_DIFFERNECE_BETWEEN_TWOWLWMWNTSINARRAY {
   
	 public static void main(String[] args) {
	
      int[] a= {1,2,3,5,6,10,20};
      Arrays.sort(a);
      for(int num:a)
      {
    	  System.out.print(num + " ");
      }
      int maxdifference=a[a.length-1]-a[0];
      System.out.println("\nthe maxdifference is :" +maxdifference);
	}

}
