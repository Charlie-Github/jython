package main;

import org.python.util.PythonInterpreter;

public class main {

	public static void main(String[] args) {
		
		PythonInterpreter pyInterpreter = new PythonInterpreter();  

		pyInterpreter.execfile("FirstModule.py"); 

	}

}
