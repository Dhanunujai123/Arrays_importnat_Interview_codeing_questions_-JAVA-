package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToPrint2DRandomArray {
public static void main(String[] args) {
	
	System.out.println("Enter the size of an array");
	Scanner sc=new Scanner(System.in);
	int length=sc.nextInt();
	int a[][]= new int[length][length];
	for(int i=0;i<length;i++)
	{
		for(int j=0;j<length;j++)
		{
			System.out.println("ENter array elements a["+i+"]["+j+"]");
			a[i][j]=sc.nextInt();
			System.out.println(a[i][j]);
	    }
	}
	List<Integer> array=new ArrayList<>();
	
	for(int i=0;i<length;i++)
	{
		for(int j=0;j<length;j++)
		{
			array.add(a[i][j]);
		}
	}
	System.out.println(array);
	
}
}
