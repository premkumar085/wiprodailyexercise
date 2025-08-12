package com.wipro.collection;

public class GenBox <T> {
	T t;

	public GenBox (T t) {
		this.t = t;
		
	}

	public T getData() {
		return t;
	}
	

}
