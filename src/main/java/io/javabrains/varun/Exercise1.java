package io.javabrains.varun;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
		StreamSources.intNumbersStream().forEach(num -> System.out.print(num +" "));
		
		System.out.println("");
        // Print numbers from intNumbersStream that are less than 5
        StreamSources.intNumbersStream().filter(num -> num<5)
        								.forEach(num -> System.out.print(num +" "));

        System.out.println("");
        // Print the second and third numbers in intNumbersStream that's greater than 5
        StreamSources.intNumbersStream().filter(num -> num>5)
        								.skip(1) // skip 1st num after 5
        								.limit(2) //print 2nd and 3rd
        								.forEach(num -> System.out.print(num +" "));

        System.out.println("");
        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        Integer val = StreamSources.intNumbersStream().filter(num -> num>5)
        											  .findFirst()
        											  .orElse(-1);
        System.out.print("val = "+val);
        								

        // Print first names of all users in userStream
        System.out.println();
        StreamSources.userStream().forEach( userObj -> System.out.print(userObj.getFirstName() +" "));

        // Print first names in userStream for users that have IDs from number stream
        System.out.println();
        StreamSources.intNumbersStream()
        			 .flatMap(id -> StreamSources.userStream()
        					 					 .filter(user -> user.getId() == id))
        			 .map(user -> user.getFirstName())
        			 .forEach(userName -> System.out.print(userName +" "));
		
		
	}//psvm ends

}
