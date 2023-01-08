package io.javabrains.varun;

import java.util.stream.Stream;

public class StreamSources {
	
	public static Stream<String> stringNumbersStream()
	{
		return Stream.of("one","two","three","four","five");
	}
	
	public static Stream<Integer> intNumbersStream()
	{
		return Stream
				.iterate(0,i->i+2)
				.limit(10);
	}

	public static Stream<User> userStream()
	{
		return Stream.of(
				new User(1, "Varun","Jaiswal"),
				new User(2, "Cristiano", "Ronaldo"),
                new User(3, "Diego", "Maradona"),
                new User(4, "Zinedine", "Zidane"),
                new User(5, "Jürgen", "Klinsmann"),
                new User(6, "Gareth", "Bale")
                );
	}
	
}
