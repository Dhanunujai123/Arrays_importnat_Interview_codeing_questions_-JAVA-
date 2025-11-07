package Arrays;

public class FirstNONREPEATINGELEMENTinARRAY {
 
	public static void main(String[] args)
	{
	   int[] a= {1,2,3,4,5,6,7,8,3,9,1,10,11};
	   
	   int count=0;
	   
	   for(int i=0;i<a.length;i++)
	   {
		   
		   for(int j=i+1; j<a.length;j++)
		   {
			   if(a[i]==a[j])
			   {
				   count++;
			   }    
				   
		   }
		   if(count==1)
		   
		      {
			     System.out.println("the first non repeating element = " +a[i]);
			     break;
		       }
	  }
	    System.out.println("no non repeating elelemnt :");
	
	
}
}
