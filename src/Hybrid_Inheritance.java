class Grand_Father
{
	void gf()
	{
		System.out.println("I'm Grand Father");
	}
}

class Father extends Grand_Father
{
	void f()
	{
		System.out.println("I'm Father");
	}
}

class Mother extends Grand_Father
{
	void m()
	{
		System.out.println("I'm Mother");
	}
}

class Son extends Mother
{
	void s()
	{
		System.out.println("I'm Son");
	}
} 

class Daughter extends Father
{
	void d()
	{
		System.out.println("I'm Daughter");
	}
} 
public class Hybrid_Inheritance
{

	public static void main(String[] args)
	{
	Son sn = new Son(); // Object created Son Class
	Daughter dr = new Daughter(); // Object created Daughter class
	sn.gf(); // Method from Grand Father inherited
	sn.m(); // Method inherited from Mother
	sn.s(); // Method inherited from Son class
	dr.gf(); // Method from Grand Father inherited
	dr.f(); // Method inherited from Father
	dr.d(); // Method Inherited from Daughter calss

	}

}
