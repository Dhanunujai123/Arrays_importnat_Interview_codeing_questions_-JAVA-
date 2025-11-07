package Arrays;

public class REMOVE_DuplicatesfromArray_WITHOUT_Useing_ANYmethod {
     
	
	public static void main(String[] args) {
		
		int duplicatecount=0;
		int a[]= {1,3,2,4,6,7,2,3,1};
		
		for(int i=0;i<a.length;i++)
		{
		     for(int j=i+1;j<a.length;j++)
		     {
		    	 if(a[i]==a[j])
		    	 {
		    		 duplicatecount +=1;
		    	 }
		    	 //break;
		     }
		     
		}
		System.out.println(duplicatecount);
		
		int n =a.length-duplicatecount;
		System.out.println(n);
		
         int array[]=new int[n];
         int k=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i] != a[j])
				{
					array[k]=a[i];
					k++;
				}
			}
			
		} 
		for(int arr:array)
		{
			System.out.print(array[k] + " ");
		}
		
	}
	
}
