package io.javabrains.varun;

import java.io.IOException;

public class Exercise4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
		ReactiveSources.intNumberMono().subscribe(
				num -> System.out.println(num),
				err -> System.out.println(err),
				()  -> System.out.println("complete"));

        // Get the value from the Mono into an integer variable
        //Integer num = ReactiveSources.intNumberMono().block();
        //its blocking - mono emits a value and its done
        //System.out.println("num from mono ="+num);
        //User foo = ReactiveSources.userMono().block();
        //System.out.println("user foo lastname ="+foo.getLastName());

        System.out.println("Press a key to end");
        System.in.read();
		
	}//psvm ends

}
