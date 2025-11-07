package Arrays;
import java.util.*;

public class ToprintaRandomARRAY {

	public static void main(String[] args) {
		System.out.println("Enter array elements length: ");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int[] a=new int[length];
		for(int i=0;i<length;i++)
		{
		  System.out.println("enter array elements a[" +i+ "]");
		  a[i]=sc.nextInt();
		}
		List <Integer> arrayelements=new ArrayList<>();
		for(int k=0;k<length;k++)
		{
			arrayelements.add(a[k]);
		
		}
		System.out.println(arrayelements);
		
		
	}
}
