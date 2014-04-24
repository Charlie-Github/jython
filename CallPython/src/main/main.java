package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class main {

	public static void main(String[] args) {
		
		
		try {
			
			System.out.println("Start calling python");			
            Process pr = Runtime.getRuntime().exec("python SecondModule.py arg1 arg2");			
            BufferedReader in = new BufferedReader(new InputStreamReader(			
                    pr.getInputStream()));			
            String line;			
            while ((line = in.readLine()) != null) {			
                System.out.println(line);			
            }			
            in.close();			
            pr.waitFor();			
            System.out.println("End of python call");

        } catch (Exception e) {			
            e.printStackTrace();			
        }

	}

}
