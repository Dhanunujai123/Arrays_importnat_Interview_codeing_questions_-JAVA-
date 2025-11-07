package Arrays;

public class NUMBERpresentARRAY_or_NOT {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int num=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println("The element " +num+ " is prersent in the given array");
			   return;
			}
			
		}
		System.out.println("The element " +num+ " is not prersent in the given array");
	

	}

}
