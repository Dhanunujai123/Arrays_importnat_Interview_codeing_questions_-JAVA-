package Arrays;

public class MAX_SUB_ARRAY_SUM {
private static final int Integer_MIN_VALUE = 0;

public static void main(String[] args) {
	
	int[] arr= {-2,-3,4,-1,-2,1,5,-3};
	System.out.println(findMaxsubarraysum(arr));
}

public static int findMaxsubarraysum(int[] arr) {
	int maxsum=Integer_MIN_VALUE;
	int currentsum=0;
	for(int i=0;i<arr.length;i++)
	{
		currentsum=currentsum+arr[i];
		maxsum=Math.max(maxsum,currentsum);
	    if(currentsum<0)
	    {
	    	currentsum=0;
	    }
	}
	return maxsum;

	
}




}
