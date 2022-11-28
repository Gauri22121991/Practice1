package JavaConcepts;

public class ifElse {
	int mul(int i, int j) {
		return i*j;
	}
	public void display() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		
		ifElse obj = new ifElse();
		int result = obj.mul(2, 4);
		if(result<20){
			System.out.println("Yes" +  result);
			
			
		}
		else
			System.out.println("No");
		obj.display();
		
	}

}
