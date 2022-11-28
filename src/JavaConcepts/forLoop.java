package JavaConcepts;

public class forLoop {
	 

	public static void main(String[] args) {
		char[] ch = {'a','s','d','f'};
		for(int i = 1; i<=10; i++) {
			System.out.println("The value of i is:" + i);
		}
		
		for (char c:ch){
			System.out.println(c);
			if(c=='d') {
				break;
			}
		}	
		for(int j=1; j<=ch.length; j++) {
			System.out.println(j);
				if(j>=3) {
				System.out.println("identified");
				break;
			}
		}
		}
		

	}


