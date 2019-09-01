abstract class Human		//Abstract Class
{
	public abstract void eat();
	public void walk()
	{
		System.out.println("Nahi..Aaj nhi..Udya pasun jau..");
	}
}

class Man extends Human		//Concrete Class
{
	public void eat()
	{
		System.out.println("Ho chal kahi tari khauyat");
	}
}


public class Abstr {

	public static void main(String[] args) 
	{
		Human parag= new Man();
		parag.eat();
		
		parag.walk();
		

	}

}
