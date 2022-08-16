
class D extends A // Inherit from base class A
{
	void dog()
	{
System.out.println("Hi i from D Child Class");
}
}

public class Multiple_Inheritance {

	public static void main(String[] args)
	{
		B b=new B(); // Object created  class B inherited from class A
		C c=new C(); // Object created class c inherited from class A
		D d=new D(); // Object created class D inherited from class A
		b.apple(); // Method inherited from parent class A but object is calling from child class B
		c.apple(); // Method inherited from parent class A but object is calling from child class C
		d.apple(); // Method inherited from parent class A but object is calling from child class D

	}

}
