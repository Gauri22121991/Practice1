package JavaConcepts;

public class javaVariables {
	int i = 17;
	static String string = "Learning Java";
	int add(int a, int b) {
		return a+b;
	}
	

	public static void main(String[] args) {
		javaVariables obj = new javaVariables();
		System.out.println(obj.i);
		System.out.println(javaVariables.string);
		System.out.println(obj.add(3, 6));
		

	}

}
