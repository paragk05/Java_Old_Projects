class Student
{
	private int roll;
	private String name;
	
	//Getters And Setters

	//Right Click > Source > Generate Getter and Setter
	
	
	public int getRoll() 
	{
		return roll;
	}
	public void setRoll(int roll) 
	{
		this.roll = roll;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
		
}



public class Encap {

	public static void main(String[] args) 
	{
		Student s1= new Student();
		
		s1.setName("Parag");
		s1.setRoll(5);
		
		
		
		System.out.print(s1.getName()+":\t");
		System.out.println(s1.getRoll());


	}

}
