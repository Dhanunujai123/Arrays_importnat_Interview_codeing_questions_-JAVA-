package Arrays;

public class INDEX_of_An_ELEMENT {
public static void main(String[] args) {
	String[] str= {"apple","orange","banana"};
	int index=0;
	
	for(int i=0;i<str.length;i++)
	{
		
		if(str[i]=="orange")
		{
			index=i;
		}
		
	
	}
	System.out.println(index);
	String word="orange";
	
	System.out.println(word.indexOf('e'));
	
	
}
}
