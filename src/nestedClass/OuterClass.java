package nestedClass;

public class OuterClass { //

	public String name;

	// Objects created to call inner class methods
	InnerClassA innerA = new InnerClassA();
	InnerClassB innerB = new InnerClassB();

	// outer class allow to call inner class methods through outer class to another class
	public void outerClassMethodA() {

		System.out.println("Outer Method A");

		innerA.innerClassMethodA(); // Outer class can call all methods from inner class
		innerB.innerClassMethodB(); // even though innerclassB is private still can call in OuterClass
	}

	// inner class can also call outer class methods but the whole concept is to call through outer class

	// innerclass A declare as public
	public class InnerClassA {

		public String id;

		public void innerClassMethodA() {

			System.out.println("Inner Method A");
		}

	}

	// innerclass B declare as private
	private class InnerClassB {

		private String id;

		private void innerClassMethodB() {

			System.out.println("Inner Method B");
		}

	}
}
