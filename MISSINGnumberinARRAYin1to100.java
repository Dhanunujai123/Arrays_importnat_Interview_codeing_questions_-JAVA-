package Arrays;

public class MISSINGnumberinARRAYin1to100 {
	
	public static void main(String[] args) {
		
		/*int[] a=new int[101];
		for(int i=0;i<101;i++)
		{
			System.out.print( i+ " ");
			
		}*/
		
		 int[] a= {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,96,97,98,99};
		
		 boolean[] present=new boolean[101];
		 for(int num:a)
		 {
			 if(num>1 && num<=100)
			 {
				 present[num]=true;
			 }
		 }
		 System.out.println        ("the missing Numbers are : ");
		 for(int i=0;i<101;i++)
		 {
			 if(!present[i])
				 
			 {
				 System.out.println(i + " ");
			 }
		 }
	}

}
