package inf101.v19.ex0.helloworld;

/**
 * Skriver ut Hello world! 
 * 
 * @author Anna Eilertsen - anna.eilertsen@uib.no 
 *
 */
public class HelloWorld {
	
	public static void main(String[] args) {
		String helloWorld = getHelloWorld();
		System.out.println(helloWorld);
	}

	/**
	 * Henter en Hello World-{@link String}  
	 * 
	 * @return "Hello World!" 
	 */
	public static String getHelloWorld() {
		return "Hello World!";
	}
}
	