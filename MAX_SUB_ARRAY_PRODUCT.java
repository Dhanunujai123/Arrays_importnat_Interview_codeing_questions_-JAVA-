package Arrays;

public class MAX_SUB_ARRAY_PRODUCT {
	public static int  main(String[] args) {
		int a[]= {3,8,-4,4,9,1,-6,8,2,12,2};
        int max=Integer.MIN_VALUE;
        int currentproduct=1;
        for(int i=0;i<a.length;i++)
        {
        	currentproduct=currentproduct * a[i];
        	max=Math.max(max,currentproduct);
        	if(max < currentproduct)
        	{
        		max=currentproduct;
        	}
        }
        return max;
      }
}
