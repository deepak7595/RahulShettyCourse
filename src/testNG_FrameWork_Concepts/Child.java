package testNG_FrameWork_Concepts;

import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Child extends parent {

	@Test
	public void childclass() {
		// this will access the data from parent class. we no need to create object to
		// handle this.

		// if parent class extends to child, when we execute, it alwways checks the parent class first. and then execution comes to child
		TestRe();
		
		int a = 3;
		//These below methods from child2 class. and we haven't extends that class to child1. So to access the class, we have to create object for the class.
		// Above methods we have extended the class, so we no need to create object 
		Child2 c = new Child2(3); // its parameterized constructor.
		System.out.println(c.decrement());
		System.out.println(c.increment());
		
		
		// we are passing the int value from here, this way we creating the link to child2.
		// if we send this way, we have to send multipe times. So we better to pass the value through object.
//		System.out.println(c.decrement(3));
//		System.out.println(c.increment(4));
		
		// if we create the object with parameter, then we should call the constructor explictly to where it required. 
		
		
		//To access variable from child3
		// since we extend the child3, so we are accessing the property, by using child2 object.
		//Child3 c = new Child3(a); => Not required
		System.out.println(c.MultiplebyThree());
		System.out.println(c.multiplebyTwo());
		

	}
	
	
	

}
