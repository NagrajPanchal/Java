class A
{
	void apple()
	{
System.out.println("Hi i from A Parent Class");
}
}

class B extends A // Single level inherited 
{
	void ball()
	{
System.out.println("Hi i from b Child Class");
}
}


public class Single_Level_Inheritance {

	public static void main(String[] args) {
	B b=new B(); // Object created only one inherited class B
	b.apple(); // Method inherited from parent class A
	b.ball(); // Method from child class 

	}

}
