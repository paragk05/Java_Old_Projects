import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListInter {

	public static void main(String[] args)
	{
		List val= new ArrayList();
		val.add(5);	//Integer v= new Integer(4);
		val.add(8);
		val.add(12);
		val.add(4);
		val.add(2,24);
		val.add(3,"Parag");

		for(int i=0;i<val.size();i++)
		{
			System.out.println(val.get(i));
		}

	}

}
