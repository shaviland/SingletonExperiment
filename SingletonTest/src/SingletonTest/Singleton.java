package SingletonTest;

public class Singleton {
	
	private static Singleton instance;
	private String data;
	
	private Singleton() {};
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public static Singleton getInstance() {
		
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
		
	}
	public void hello() {
		System.out.println("Hello World!");
	}
	
	
	public boolean palindromeChecker(String incoming) {
		String stringTest = incoming.toLowerCase().replaceAll("[^a-z]", "");

		for (int i = 0; i < stringTest.length() / 2; i++) {
			if (stringTest.charAt(i) != stringTest.charAt(stringTest.length() - 1 - i)) {
				return false;
			}
		}

		return true;
	}

}
