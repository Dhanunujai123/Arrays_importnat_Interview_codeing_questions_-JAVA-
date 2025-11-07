package Arrays;

import java.util.Scanner;

public class DELETE_ELEMENT_fromARRAY_by_INDEX {
 public static void main(String[] args) {
	 int[] a= {1,2,3,4,5};
	 int index; 
	 System.out.println("Enter Index value : " );
	 Scanner sc=new Scanner(System.in);
	 index=sc.nextInt();
	 //3 elememt want to delete
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]==a[index])
		 {
			continue;
			//System.out.print(a[i]+ " ");
		 }
			System.out.print(a[i]+ " ");
	 }
	 
}
}
