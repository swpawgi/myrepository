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
		System.out.println("Welcome to Git " + name);
		

	}

}
