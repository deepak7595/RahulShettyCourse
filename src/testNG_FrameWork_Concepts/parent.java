package testNG_FrameWork_Concepts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class parent {
	
	@Test
	public void TestRe() {
	System.out.println("Deepak from parent class");

	}
	
	@BeforeClass
	public void child1() {
		System.out.println("Run me first");

	}

}


