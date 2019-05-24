package com.bazar.training.others;

import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamManagerUID {

	public static void main(String[] args) {
		Stream<UUID> stream = Stream.generate(UUID::randomUUID);
		System.out.println(stream.findFirst().get().toString()) ;
		Stream<UUID> stream1 = Stream.generate(UUID::randomUUID);
		
	
	}

}
