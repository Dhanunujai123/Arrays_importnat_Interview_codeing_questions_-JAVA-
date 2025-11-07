package Arrays;

public class SORTING_INSERTION {
public static void main(String[] args) {
	int[] a={8,6,4,1,2};
	
	
	for(int i=1;i<a.length;i++)
	{
		int temp=a[i];
		int j=i-1;
		
		while(j>=0 && a[j]>temp)
		{
			a[j+1]=a[j];
			j=j-1;
		}
		a[j+1]=temp;
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i] + " ");
	}
}
}
