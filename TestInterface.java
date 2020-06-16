
public interface TestInterface {
	// A simple program to Test Interface default 
	// methods in java 

	    // abstract method 
	    public void square(int a); 
	  
	    // default method 
	    default void show() 
	    { 
	      System.out.println("Default Method Executed"); 
	    } 
	} 

