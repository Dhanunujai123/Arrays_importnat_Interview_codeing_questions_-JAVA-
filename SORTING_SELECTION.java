package Arrays;

public class SORTING_SELECTION {
 public static void main(String[] args) {
	
	 int[] a= {1,5,2,6,3};
	 int temp,min;
	 for(int i=0;i<a.length;i++)
	 {
		 min=i;
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[min]>a[j])
			 {
				 min=j;
			 }
		 }
		 temp=a[i];
		 a[i]=a[min];
		 a[min]=temp;
		 
	 }
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.print(a[i] + " ");
	 }
}
}
