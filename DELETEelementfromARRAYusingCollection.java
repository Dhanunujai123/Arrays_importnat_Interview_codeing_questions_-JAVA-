package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DELETEelementfromARRAYusingCollection {

	public static void main(String[] args) {
		String[] stringarray= {"Dhanush","Dhanunjai","Vamisetti"};
		List<String> newstringarray=new ArrayList(Arrays.asList(stringarray));
		newstringarray.remove(1);
		System.out.println(newstringarray);
	}
}
