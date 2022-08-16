// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}


// Subclass (inherit from Animal)
class Cat extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The Cat says: myavu myavu");
  }
}


class Abstract {
  public static void main(String[] args) {
    Cat myCat = new Cat(); // Create a Cat object
    myCat.animalSound();
    myCat.sleep();
  }
}


/* 
 Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from). 
  
 */
 

