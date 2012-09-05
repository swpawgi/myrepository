/**
 * This is a sample program to illustrate usage of Git.
 * @author sumod_pawgi
 */
package HelloWorld;

import java.io.*;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World of Git!");
		System.out.println("What is your name?");
		String name = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			name = br.readLine();
		}
		catch (IOException ioe)
		{
			System.out.println("Error while reading name");
			System.exit(1);
		}
		// We will add basic testing to check if the name read and printed are the same
		String message = "Hello to the world of Git " + name;
		if (message.endsWith(name))
		{
			System.out.println("Message has the name at the right place - Test Passed");
		}
		else
		{
			System.out.println("Message does not have the name at the right place - Test failed");
		}
		

	}

}
