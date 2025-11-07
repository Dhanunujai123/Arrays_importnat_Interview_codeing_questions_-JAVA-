package Arrays;
import java.util.*;

public class EVENandODDNumbers {

	public static void main(String[] args) {
		System.out.println("Enter array size : ");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int[] a=new int[length];
		for(int i=0;i<length;i++)
		{
			System.out.println("Enter array elements a[" +i+"]");
			a[i]=sc.nextInt();
		}
		List <Integer> array=new ArrayList<>();
		
		for(int i=0;i<length;i++)
		{
			array.add(a[i]);
		}
		System.out.println(array);
		
		List <Integer> even=new ArrayList<>();
		List <Integer> odd=new ArrayList<>();
		

		int sumeven=0;
	    int sumodd=0;
		for(int i=0;i<length;i++)
		{
			if(a[i]%2==0)
			{
				even.add(a[i]);
				sumeven=sumeven+a[i];
				//System.out.println( "even numbers sum in array : " +sumeven);
			}
			else
			{
				odd.add(a[i]);
				sumodd=sumodd+a[i];
				//System.out.println("odd numbers sum odd in array : " +sumodd);
			}
				
		}
		System.out.println( "even numbers in array : " +even);
		System.out.println("odd numbers in array : " +odd);
		System.out.println( "even numbers sum in array : " +sumeven);
		System.out.println("odd numbers odd in array : " +sumodd);
	}
}
