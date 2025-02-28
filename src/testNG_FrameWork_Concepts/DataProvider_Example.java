package testNG_FrameWork_Concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Example {
	
	@Test(dataProvider="getData") 
	public void field(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
		

	}

	@DataProvider
public Object getData() {
	
		// this called multi dimensional array
		Object [][] obj = new Object [3][2]; //=> Row, column
		// values for first row and column
		obj[0][0]= "firstName";
		obj[0][1]= "password";
		
		// values for second row and column
		obj[1][0]= "secondName";
		obj[1][1]= "secondpassword";
		
		// values for third row and column
		obj[2][0]= "thirdName";
		obj[2][1]= "thirdpassword";
				
		return obj;
		
		// we should return the object of the 2d array
	

}
	
	//This will gets the data from the method. we should specify the method name, which has the data.
	
	
	
}
