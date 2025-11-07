package Arrays;

public class SECONDDUPLICATEelementinARRAY {
	public static void main(String[] args) {
		int[] a= {1,3,4,6,8,9,1,9,};
		int duplicateelementcount=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				//int duplicateelementcount=0;
				if(a[i]==a[j])
				{
					duplicateelementcount++;
				
				  if(duplicateelementcount==1)
				  {
					System.out.println("first duplicate element : " +a[i]);
				  }
				  else if(duplicateelementcount==2)
				  {
					System.out.println("second duplicate element : " +a[i]);
					return;
				  }
				  break;
			   }
					
			}
			
		}
		
		
	}

}
