package Arrays;

public class MOVE_NEGATIVE_INTEGERs_to_STARTof_ARRATY {
public static void main(String[] args) 
{
	int[] a= {1,3,5,-2,-1,-3};
	int j=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<0)
		{
			if(i!=j)
			{
	           	int temp=a[i];
	           	a[i]=a[j];
	           	a[j]=temp;
			}
			j++;
		}	
	
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+ " ");
	}
}
}
