import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Coll {

	public static void main(String[] args) 
	{
		Collection val= new ArrayList();
		val.add(5);
		val.add(8);
		val.add(12);
		val.add(4);
		val.add(9);
		

		Iterator i= val.iterator();
		
		while(i.hasNext())  //hasNext() used to check, is there next element or not 
		{
			System.out.println(i.next());  //next() is used to fetch the value from iterator
			
		}

	}

}
