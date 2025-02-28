package testNG_FrameWork_Concepts;

public class Child2 extends Child3{

	int a;

	// receiving value form child class object. this scope of the value only lies inside the method. its called instance variable.
	public Child2(int a) {
		super(a); // we are invoking the parent class by using this constructor . Super should be placed before this, thats the rule. when we use both in same method.
		this.a=a;  // here we are assigning the value, to the current class instance.
		// this keyword refers to the current class.
		// super keyword refers to the parent class.

	}


	// this is applicable when we send the data through obj creation.
	//	public int increment(int a) {
	//		a=a+1;
	//		return a;
	//
	//	}
	//	
	//	public int decrement(int a) {
	//		a=a-1;
	//		return a;
	//	}

	public int increment() {
		a=a+1;
		return a;

	}

	public int decrement() {
		a=a-1;
		return a;
	}

}
