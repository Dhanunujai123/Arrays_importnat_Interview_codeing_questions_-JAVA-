package Arrays;

public class DeleteAELEMENT 
{
	public static void main(String[] args) {
		 int[] a= {1,2,3,4,5,5,6,9};
		 int delete=5;
		 for(int i=0;i<a.length;i++)
		 {
			 if(delete != a[i])
			 {
				 System.out.print(a[i] +" ");
			 }
		 }
	}

}
