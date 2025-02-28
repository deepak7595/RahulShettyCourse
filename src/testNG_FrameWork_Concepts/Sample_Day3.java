package testNG_FrameWork_Concepts;

import org.testng.annotations.Test;

public class Sample_Day3 {
	
	@Test(groups = {"Smoke"})
	public void Sleep() {
		System.out.println("Sleep");

	}
	@Test
	public void Wake() {
		System.out.println("Wake");

	}

}
