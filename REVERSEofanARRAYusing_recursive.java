package Arrays;

public class REVERSEofanARRAYusing_recursive {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		System.out.println(recursive(a,0,a.length-1));
		for(int i:a)
		{
			System.out.println(i+" ");
		}
	}
	
	public static int[] recursive(int[] a,int start, int end)
	{
		if(start>end)
		{
			return a;
		}
		int temp;
		temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		return recursive(a,start+1,end-1);
		
	}
}
