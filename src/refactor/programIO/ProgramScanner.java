package refactor.programIO;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramScanner {

   //create an object of SingleObject
   private static ProgramScanner instance = new ProgramScanner(System.in);

   //make the constructor private so that this class cannot be
   //instantiated
   private ProgramScanner(InputStream in){}

   //Get the only object available
   public static ProgramScanner getInstance(){
      return instance;
   }
   
   public char readChar() {
      System.out.println("Please enter a char!");
      // Ignored closing this 'sc' since it causes problems with I/O.
      Scanner sc = new Scanner(System.in); 
		try {	
			char c = sc.next().charAt(0);
			return c;
			}
		finally {
			System.out.println("Input detected!");
		}
   }
   
   public int readInt() {
	      System.out.println("Please enter an integer!");
	   // Ignored closing this 'sc' since it causes problems with I/O.
	      Scanner sc = new Scanner(System.in); 
			try {	
				int c = sc.nextInt();
				return c;
				}
			catch (InputMismatchException e) {
				System.out.println("Not a number!");
				return 0;
			}
			finally {
				System.out.println("Input detected!");
			}

	   }
   
   public String readCString() {
	      System.out.println("Please enter a string!");
	   // Ignored closing this 'sc' since it causes problems with I/O.
	      Scanner sc = new Scanner(System.in); 
			try {	
				String c = sc.next();
				return c;
				}
			finally {
				System.out.println("Input detected!");
			}

	   }
}