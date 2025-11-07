package Arrays;

public class COMMON_ELEMENTS_between_TWOARRAYS {
public static void main(String[] args) {
	int[] a= {1,2,4,6,7,5,8};
	int[] b= {1,2,5,6};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i]+ " ");
				break;
			}
		}
	}
 }
}
