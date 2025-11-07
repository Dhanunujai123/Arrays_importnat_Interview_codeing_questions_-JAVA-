package Arrays;

public class SEARCH_of_an_ELEMENt {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,3,5};
		int elementindex=0;
		int element=3;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				elementindex=i;
				break;
			}
		}
		if(elementindex !=0)
		{
			System.out.println("element " +element+ " found at index " +elementindex );
		}
	}
}
