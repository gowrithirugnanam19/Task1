package com.ex;

import java.util.function.Consumer;

public class MyObject implements Consumer< Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Data "+t);
	}
}
