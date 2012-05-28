package oop.ex2.main;

import java.io.*;

public class Sjavac {

	/**
	 * An Sjava compiler, receives a source file and checks
	 * whether it is valid or not.
	 * Validity is indicated by the exit value of the program:
	 * exit value 0 - means a legal code
	 * exit value 1 - means an illegal code
	 * exit value 2 - indicates an IO error
	 * @param args - the path of the source file the check
	 */
	public static void main(String[] args) {
		try {
			filePathCheck(args);
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
			System.exit(2);
		}
	}
	
	/**
	 * check validity of argument given by the user (i.e the source file path)
	 * @param args - the argument given by the user.
	 * @throws InvalidArgumentException 
	 */
	private static void filePathCheck(String[] args) throws InvalidArgumentException {
		if (args == null) throw new EmptyArgumentException();
		else if (args.length != 1) throw new InvalidArgumentException();
		else{ // input length is valid 
			File sourceFile = new File(args[0]);
			if (!sourceFile.isFile()) throw new BadFileArgumentException();
		}
		
	}

}
