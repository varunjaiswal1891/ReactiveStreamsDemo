package io.javabrains.varun;

import java.io.IOException;

import org.reactivestreams.Subscription;

import reactor.core.Disposable;
import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
		/*
		Disposable subscribe = ReactiveSources
				.intNumbersFlux()
				.subscribe(
				num -> System.out.println("num="+num),
				err -> System.out.println(err.getMessage()),
				() -> System.out.println("complete here")
				);
		*/

        // Subscribe to a flux using an implementation of BaseSubscriber
        ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

        System.out.println("Press a key to end");
        System.in.read();
		
	}//psvm ends

}

class MySubscriber<T> extends BaseSubscriber<T> {
	
	public void hookOnSubscribe(Subscription subscription)
	{
		System.out.println("Subscribe happened");
		request(3);
	}
	
	public void hookOnNext(T value)
	{
		System.out.println(value.toString() +" received ");
		request(1);//every time asking for one more item
	}
}
