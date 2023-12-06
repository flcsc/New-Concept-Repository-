public class Nathan
{
	// Instance variables (fields)
	private String name;
	private int age;
	private int heightInches;
	private int grade;

	// Constructor of class
	public Nathan(String name, int age, int heightInches, int grade)
	{
		this.name = name;
		this.age = age;
		this.heightInches = heightInches;
		this.grade = grade;
	}
	
	// Prints "Hello Nathan"
	public void sayHello()
	{
		System.out.println("Hello Nathan");
	}

	// Says "How are you" to user
	public void howAreYou(String name)
	{
		System.out.println("How are you, " + name + "?");
	}

	// toString() method to return attributes of the object
	public String toString()
	{
		return "This is " + name + " who is " + age + " years old, in Grade " + grade + ", and is " + heightInches + " cm tall.";
	}
}
