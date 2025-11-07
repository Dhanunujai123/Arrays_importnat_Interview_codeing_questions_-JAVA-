package Arrays;

public class MOVE_ZERO_TO_END_of_anARRAY
{
	public static void main(String[] args) {
	int[] a= {1,0,2,3,2,0,0,4,5,1};
	int count=0;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0)
			{
				a[count++]=a[i];
				
			}
	} 
	while(count<a.length)
	{
		a[count++]=0;
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+ " ");
	}
}
}
