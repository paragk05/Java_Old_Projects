interface Writer
{
	void write();
	
}

class Pencil implements Writer
{
	public void write() 
	{
		System.out.println("Pencil");
	}
}

class Pen implements Writer
{
	public void write() 
	{
		System.out.println("Pen");
	}
}
class Kit
{
	public void DoSome(Writer p)
	{
		p.write();
	}
}

public class Inter {

	public static void main(String[] args) 
	{
		Kit k= new Kit();
		Writer p= new Pen();
		Writer pc= new Pencil();
		k.DoSome(pc);
		

	}

}
