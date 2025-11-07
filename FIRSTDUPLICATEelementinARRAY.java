package Arrays;

public class FIRSTDUPLICATEelementinARRAY {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,2,10,5,6,7,8,10};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			     if(a[i]==a[j])
			     {
				    System.out.println("the first duplicate element is : " +a[j]);
				    return;
				 }
			}
		}
		System.out.println("No duplicate element...");
	}

}
