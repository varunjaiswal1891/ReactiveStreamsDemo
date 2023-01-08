package io.javabrains.varun;

import java.io.IOException;

public class Exercise2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        ReactiveSources.intNumbersFlux().subscribe(e -> System.out.print(e +" "));

        // Print all users in the ReactiveSources.userFlux stream
        ReactiveSources.userFlux().subscribe(user -> System.out.println(user));
		
       System.out.println("Press a key to end");
       System.in.read();
		
	}//psvm ends

}
