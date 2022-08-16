class C extends B // Multi level inherited 
{
	void cat()
	{
System.out.println("Hi i from C Child Class");
}
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
	C c=new C(); // Object created only one inherited class C
	c.apple(); // Method inherited from parent class A
	c.ball(); // Method from Sub class B
	c.cat(); // Method from child class C

	}

}


