package Arrays;

public class PRIMEnumbersinARRAY {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,5,6,7,8,9,10,11,12,13,20};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			//int sum=0;
			for(int k=1;k<a.length;k++)
			{
				//int count=0;
				if(a[i]%k==0)
			    {
				   count=count+1;
				  // System.out.println(a[i]);
			    }
			}
			if (count == 2)
		    {
			   System.out.println(a[i]);
			   sum=sum+a[i];
			   //System.out.println(sum);
		    }
		}
		System.out.println( "The sum of prime numbers in an array is " +sum);
	}
}
